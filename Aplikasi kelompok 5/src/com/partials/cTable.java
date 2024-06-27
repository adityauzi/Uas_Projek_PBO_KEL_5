package com.partials;

import java.awt.Color;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class cTable extends JTable {

    public cTable(javax.swing.table.TableModel model){

        super(model);
        getTableHeader().setBackground(Color.BLUE);
        getTableHeader().setForeground(Color.WHITE);
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        setShowVerticalLines(false);
        setShowHorizontalLines(false);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setDragEnabled(true);

    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

}
