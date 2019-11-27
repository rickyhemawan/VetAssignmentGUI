/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialog;

import Model.Dose;
import Utils.GlobalFunction;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ricky
 */
public class DrugListTableModel extends AbstractTableModel{
    
    private ArrayList<Dose> doses;
    private String[] columnNames= {"Drug Name", "Date Added", "Dose(mg)"};

    public DrugListTableModel(ArrayList<Dose> doses) {
        this.doses = doses;
    }

    public DrugListTableModel() {
    }

    public ArrayList<Dose> getDoses() {
        return doses;
    }

    public void setDoses(ArrayList<Dose> doses) {
        this.doses = doses;
        fireTableDataChanged();
    }
    

    @Override
    public int getRowCount() {
        return doses.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Dose dose = doses.get(i);
        switch(i1){
            case 0 : return dose.getNameOfDrug();
            case 1 : return GlobalFunction.dateToStr(dose.getDate());
            case 2 : return dose.getDoseInGrams();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    
    
}
