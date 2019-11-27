/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utils.GlobalFunction;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ricky
 */
public abstract class Pet implements Serializable, Comparable<Pet>{
    private int petID;
    private String name;
    private double weight;
    private Date dob;
    private double accumulatedDose;
    private ArrayList<Dose> doseList;

    public Pet(int petID, String name, double weight, Date dob, double accumulatedDose) {
        this.petID = petID;
        this.name = name;
        this.weight = weight;
        this.dob = dob;
        this.accumulatedDose = accumulatedDose;
        this.doseList = new ArrayList<>();
    }

    public Pet() {
        this.accumulatedDose = 0;
        this.doseList = new ArrayList<>();
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getAccumulatedDose() {
        return accumulatedDose;
    }

    public void setAccumulatedDose(double accumulatedDose) {
        this.accumulatedDose = accumulatedDose;
    }

    public ArrayList<Dose> getDoseList() {
        return doseList;
    }

    public void setDoseList(ArrayList<Dose> doseList) {
        this.doseList = doseList;
    }
    
    public void addDose(Dose d){
        this.doseList.add(d);
        updateAccumulatedDose();
    }
    
    public void updateAccumulatedDose(){
        this.accumulatedDose = 0;
        for(Dose dose : doseList){
            this.accumulatedDose = this.accumulatedDose + dose.getDoseInGrams();
        }
    }
    
    public int findAge(){
        
        int differenceInMonth = 0;
        Date firstDate = this.dob;
        Date secondDate = new Date();
        Calendar firstCalendar = Calendar.getInstance();
        firstCalendar.setTime(firstDate);
        int firstMonth = firstCalendar.get(Calendar.MONTH) + 1;
        int firstYear = firstCalendar.get(Calendar.YEAR);
        int firstDay = firstCalendar.get(Calendar.DAY_OF_MONTH);

        Calendar secondCalendar = Calendar.getInstance();
        secondCalendar.setTime(secondDate);
        int secondMonth = secondCalendar.get(Calendar.MONTH) + 1;
        int secondYear = secondCalendar.get(Calendar.YEAR);
        int secondDay = secondCalendar.get(Calendar.DAY_OF_MONTH);

        if(firstDay <= secondDay && firstMonth == secondMonth){
            differenceInMonth = (secondYear - firstYear) * 12;
        }else if(firstMonth > secondMonth){
            differenceInMonth = (secondMonth + 12 - firstMonth) + ((secondYear - firstYear - 1) * 12);
        }else if(firstMonth < secondMonth){ 
            differenceInMonth = (secondMonth - firstMonth) + (secondYear - firstYear ) * 12;
        }else if(firstMonth == secondMonth && firstDay > secondDay){
            differenceInMonth = (secondYear - firstYear -1) * 12 + 11;
        }

        if(secondMonth - firstMonth == 1 && secondDay + 30 - firstDay < 30){
        	differenceInMonth = differenceInMonth - 1;
        }
        return differenceInMonth;

    }
    
    public abstract double getDose();
    public abstract double getMaxDose(); 

    @Override
    public int compareTo(Pet t) {
        if(this.accumulatedDose > t.getAccumulatedDose()){
            return 1;
        }
        else if(this.accumulatedDose < t.getAccumulatedDose()){
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return Integer.toString(petID)+ 
                "," + name + 
                "," + Double.toString(weight)+ 
                "," + GlobalFunction.dateToStr(dob) + 
                "," + Double.toString(accumulatedDose);
    }
     
}
