/*
 * Copyright 2017 Danang Galuh Tegar P.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jogjadamai.infest.customer;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Danang Galuh Tegar P
 */
public class MainGUI extends JFrame implements Runnable {
    
    protected static enum MainPaneList {
        WELCOME, CORE, FINAL
    }
    
    protected static enum HeaderButtonOption {
        APPETIZER, MAIN_COURSE, DESSERT, BEVERAGES, CART
    }
    
    public MainGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println("[INFEST] " + ex.getLocalizedMessage());
        }
        initialiseComponents();
    }

    private void initialiseComponents() {
        
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        mainPanel = new JPanel() {
            
            private String getNowTime() {
                return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS").format(LocalDateTime.now());
            }
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image backgroundImage;
                BufferedImage backgroundBufferedImage = null;
                try {
                    backgroundBufferedImage = ImageIO.read(getClass().getResource("/com/jogjadamai/infest/assets/Background-Main.png"));
                    try {
                        Double widthScalingFactor = new Integer(Toolkit.getDefaultToolkit().getScreenSize().width).doubleValue() / new Integer(backgroundBufferedImage.getWidth()).doubleValue();
                        Double heightScalingFactor = new Integer(Toolkit.getDefaultToolkit().getScreenSize().height).doubleValue() / new Integer(backgroundBufferedImage.getHeight()).doubleValue();
                        Double scalingFactor = (widthScalingFactor >= heightScalingFactor) ? widthScalingFactor : heightScalingFactor;
                        Integer newWidth = (int) (backgroundBufferedImage.getWidth() * scalingFactor);
                        Integer newHeight = (int) (backgroundBufferedImage.getHeight() * scalingFactor);
                        backgroundImage = new ImageIcon(backgroundBufferedImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH)).getImage();
                    } catch (NullPointerException ex) {
                        System.err.println("[INFEST] " + getNowTime() + ": " + ex.getLocalizedMessage());
                        backgroundImage = null;
                    }
                } catch (IOException ex) {
                    System.err.println("[INFEST] " + getNowTime() + ": " + ex.getLocalizedMessage());
                    backgroundImage = null;
                }
                if(backgroundImage != null) g.drawImage(backgroundImage, 0, 0, null);
            }
            
        };
        welcomePane = new WelcomePane();
        corePane = new CorePane();
        
        setTitle("INFEST: Customer");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setUndecorated(true);
        setIconImage(new ImageIcon(getClass().getResource("/com/jogjadamai/infest/assets/InfestIcon.png")).getImage());
        
        mainPanel.setMaximumSize(screenSize);
        mainPanel.setMinimumSize(screenSize);
        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setOpaque(false);
        mainPanel.setPreferredSize(screenSize);
        mainPanel.setLayout(new CardLayout());
        mainPanel.setSize(screenSize);
        mainPanel.add(welcomePane, MainPaneList.WELCOME.name());
        mainPanel.add(corePane, MainPaneList.CORE.name());
        
        setContentPane(mainPanel);
        
        pack();
        
    }
    
    private Customer customer;
    private Dimension screenSize;
    protected JPanel mainPanel;
    protected WelcomePane welcomePane;
    protected CorePane corePane;
    
    @Override
    public void run() {
        customer = Customer.getInstance();
        getContentPane().setBackground(new java.awt.Color(0xffffff));
    }
    
}
