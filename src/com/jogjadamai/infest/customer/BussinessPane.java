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


/**
 *
 * @author Danang Galuh Tegar P
 */
public class BussinessPane extends javax.swing.JPanel {

    private final CorePane parent;
    private final Integer paneWidth;
    private final Integer paneHeight;
    private final Integer sideGap;
    private final Integer upperGap;
    private final Integer childContentPaneWidth;
    private final Integer childContentPaneHeight;
    
    protected static enum ChildContentPaneList {
        LIST_MENU, DETAIL_MENU, CART
    }
    
    /**
     * Creates new form ChildContentPanel
     * @param paneWidth
     * @param paneHeight
     * @param sideGap
     */
    BussinessPane(CorePane parent, Integer paneWidth, Integer paneHeight, Integer sideGap) {
        this.parent = parent;
        this.paneWidth = paneWidth;
        this.paneHeight = paneHeight;
        this.sideGap = sideGap;
        this.upperGap = 120;
        this.childContentPaneWidth = (this.paneWidth - (2 * this.sideGap));
        this.childContentPaneHeight = (this.paneHeight - upperGap);
        initComponents();
    }
                        
    private void initComponents() {

        childContentPane = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(paneWidth, paneHeight));
        setMinimumSize(new java.awt.Dimension(paneWidth, paneHeight));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(paneWidth, paneHeight));

        childContentPane.setOpaque(false);
        childContentPane.setBorder(null);
        childContentPane.setMaximumSize(new java.awt.Dimension(childContentPaneWidth, childContentPaneHeight));
        childContentPane.setMinimumSize(new java.awt.Dimension(childContentPaneWidth, childContentPaneHeight));
        childContentPane.setPreferredSize(new java.awt.Dimension(childContentPaneWidth, childContentPaneHeight));
        childContentPane.setLayout(new java.awt.CardLayout());
        childContentPane.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                childContentPaneMouseEntered(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(sideGap, sideGap, sideGap)
                .addComponent(childContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(sideGap, sideGap, sideGap))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(upperGap, upperGap, upperGap)
                .addComponent(childContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }               

    private void childContentPaneMouseEntered(java.awt.event.MouseEvent evt) {
        if(parent.isSubMenuVisible()) parent.setSubMenuVisible(false);
    }

    // Variables declaration - do not modify                     
    protected javax.swing.JPanel childContentPane;
    // End of variables declaration                   
}
