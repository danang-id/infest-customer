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
package com.jogjadamai.infest.tablemodel;

/**
 * <h1>class <code>CartsTableModel</code></h1>
 * <p><code>CartsTableModel</code> is <code>javax.swing.table.AbstractTableModel</code>
 * class defining the table model of <code>Report</code> entity.</p>
 * <br>
 * <p><b><i>Coded, built, and packaged with passion by Danang Galuh Tegar P for Infest.</i></b></p>
 * 
 * @author Danang Galuh Tegar P
 * @version 2017.03.10.0001
 */
public final class CartsTableModel extends javax.swing.table.AbstractTableModel {

    private final java.util.List<com.jogjadamai.infest.entity.Orders> ORDER_LIST;
    private final com.jogjadamai.infest.entity.Features currencyFeature;

    public CartsTableModel(java.util.List<com.jogjadamai.infest.entity.Orders> tableList, com.jogjadamai.infest.entity.Features currencyFeature) {
        this.ORDER_LIST = tableList;
        this.currencyFeature = currencyFeature;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return this.ORDER_LIST.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Menu Name";
            case 1:
                return "Quantity [unit(s)]";
            case 2:
                return (currencyFeature.getStatus()==1) ?  "Unit Price [" + currencyFeature.getDescription() + "]" : "Unit Price";
            case 3:
                return "Sub-Total";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return this.ORDER_LIST.get(row).getIdmenu().getName();
            case 1:
                return this.ORDER_LIST.get(row).getTotal();
            case 2:
                return getPrice(this.ORDER_LIST.get(row).getIdmenu());
            case 3:
                return (this.ORDER_LIST.get(row).getTotal() * this.ORDER_LIST.get(row).getIdmenu().getPrice());
            default:
                return null;
        }
    }
    
    private String getPrice(com.jogjadamai.infest.entity.Menus menu) {
        java.text.NumberFormat format = java.text.NumberFormat.getNumberInstance(java.util.Locale.getDefault());
        return format.format(menu.getPrice()) + " " + currencyFeature.getDescription();
    }
    
}
