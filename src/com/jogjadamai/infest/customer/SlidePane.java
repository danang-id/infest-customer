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
public class SlidePane extends javax.swing.JPanel {

    private final CorePane parent;
    private final Integer paneWidth;
    private final Integer paneHeight;

    /**
     * Creates new form SlidePanel
     * @param parent
     * @param paneWidth
     * @param paneHeight
     */
    public SlidePane(CorePane parent, Integer paneWidth, Integer paneHeight) {
        this.parent = parent;
        this.paneWidth = paneWidth;
        this.paneHeight = paneHeight;
        initialiseComponents();
    }
                   
    private void initialiseComponents() {

        setMaximumSize(new java.awt.Dimension(paneWidth, paneHeight));
        setMinimumSize(new java.awt.Dimension(paneWidth, paneHeight));
        setName("slidePane"); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(paneWidth, paneHeight));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, paneWidth, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, paneHeight, Short.MAX_VALUE)
        );
    }                   


    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
