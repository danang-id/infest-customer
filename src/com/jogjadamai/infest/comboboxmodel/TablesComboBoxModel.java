/*
 * Copyright 2017 Adam Afandi.
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
package com.jogjadamai.infest.comboboxmodel;

/**
 * <h1>class <code>TablesComboBoxModel</code></h1>
 * <p><code>TablesComboBoxModel</code> is <code>javax.swing.AbstractListModel</code>
 * class defining the table model of <code>Report</code> entity.</p>
 * <br>
 * <p><b><i>Coded, built, and packaged with passion by Danang Galuh Tegar P for Infest.</i></b></p>
 * 
 * @author Danang Galuh Tegar P
 * @version 2017.03.10.0001
 */
public final class TablesComboBoxModel extends javax.swing.AbstractListModel implements javax.swing.ComboBoxModel {

    private final java.util.List<com.jogjadamai.infest.entity.Tables> tableList;

    private String selection = null;
    
    public TablesComboBoxModel(java.util.List<com.jogjadamai.infest.entity.Tables> tableList) {
        this.tableList = tableList;
    }

    @Override
    public int getSize() {
        return tableList.size();
    }

    @Override
    public Object getElementAt(int index) {
        return tableList.get(index).getName();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selection = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selection;
    }
    
}
