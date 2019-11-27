/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utils.GlobalFunction;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ricky
 */
public class Dose implements Serializable{
    private String nameOfDrug;
    private Date date;
    private double doseInGrams;

    public Dose(String nameOfDrug, Date date, double doseInGrams) {
        this.nameOfDrug = nameOfDrug;
        this.date = date;
        this.doseInGrams = doseInGrams;
    }

    public Dose() {
    }

    public String getNameOfDrug() {
        return nameOfDrug;
    }

    public void setNameOfDrug(String nameOfDrug) {
        this.nameOfDrug = nameOfDrug;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDoseInGrams() {
        return doseInGrams ;
    }
    

    public void setDoseInGrams(double doseInGrams) {
        this.doseInGrams = doseInGrams;
    }

    @Override
    public String toString() {
        return nameOfDrug + "," + GlobalFunction.dateToStr(date) + "," + Double.toString(doseInGrams);
    }
    
    
    
}
