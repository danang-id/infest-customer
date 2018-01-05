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

import java.awt.Color;

/**
 *
 * @author Danang Galuh Tegar P
 */
public class ProgramControlWindow extends javax.swing.JFrame {

    private static ProgramControlWindow INSTANCE;
    
    protected static ProgramControlWindow getDialogInstance() {
        if(INSTANCE==null) {
            INSTANCE = new ProgramControlWindow();
            INSTANCE.getContentPane().setBackground(new java.awt.Color(255, 219, 146));
        }
        return INSTANCE;
    }
    
    private ProgramControlWindow() {
        super();
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initialiseComponents();
    }

                   
    private void initialiseComponents() {

        contentPane = new javax.swing.JPanel();
        passwordField = new javax.swing.JPasswordField();
        passwordLabel = new org.jdesktop.swingx.JXLabel();
        exitProgramButton = new org.jdesktop.swingx.JXButton();
        configProgramButton = new org.jdesktop.swingx.JXButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("INFEST: Customer >> Program Control");
        setBackground(new java.awt.Color(0xffffff));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/jogjadamai/infest/assets/InfestIcon.png")).getImage());
        setMaximumSize(new java.awt.Dimension(350, 100));
        setMinimumSize(new java.awt.Dimension(350, 100));
        setName("programControlDialog"); // NOI18N
        setResizable(false);
        setUndecorated(true);
        requestFocus();
        requestFocusInWindow();

        contentPane.setBorder(javax.swing.BorderFactory.createTitledBorder("INFEST: Customer >> Program Control"));
        contentPane.setMaximumSize(new java.awt.Dimension(350, 100));
        contentPane.setMinimumSize(new java.awt.Dimension(350, 100));
        contentPane.setPreferredSize(new java.awt.Dimension(350, 100));
        
        passwordField.addActionListener(this::passwordFieldActionPerformed);

        passwordLabel.setText("Password:");
        passwordLabel.setFont(new java.awt.Font("Open Sans", 0, 11));

        exitProgramButton.setText("Exit Program");
        exitProgramButton.setToolTipText("Exit Infest Customer");
        exitProgramButton.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        exitProgramButton.setMaximumSize(new java.awt.Dimension(160, 47));
        exitProgramButton.setMinimumSize(new java.awt.Dimension(160, 47));
        exitProgramButton.setPreferredSize(new java.awt.Dimension(160, 47));
        exitProgramButton.addActionListener(this::exitProgramButtonActionPerformed);

        configProgramButton.setText("Program Configuration");
        configProgramButton.setToolTipText("Configuration of Infest Customer");
        configProgramButton.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        configProgramButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        configProgramButton.setMaximumSize(new java.awt.Dimension(160, 47));
        configProgramButton.setMinimumSize(new java.awt.Dimension(160, 47));
        configProgramButton.setPreferredSize(new java.awt.Dimension(160, 47));
        configProgramButton.addActionListener(this::configProgramButtonActionPerformed);

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordField))
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(configProgramButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitProgramButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitProgramButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(configProgramButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }            

    private void configProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
        Customer.getInstance().controlDialogProgramConfig(this);
    }                                                   

    private void exitProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        Customer.getInstance().controlDialogProgramExit(this);
    }                                                 

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        Customer.getInstance().controlDialogProgramExit(this);
    }                                             


    // Variables declaration - do not modify                     
    private org.jdesktop.swingx.JXButton configProgramButton;
    private javax.swing.JPanel contentPane;
    private org.jdesktop.swingx.JXButton exitProgramButton;
    protected javax.swing.JPasswordField passwordField;
    private org.jdesktop.swingx.JXLabel passwordLabel;
    // End of variables declaration                   
}
