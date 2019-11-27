/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author ricky
 */
public class Dog extends Pet{
    private String breed;

    public Dog(String breed, int petID, String name, double weight, Date dob, double accumulatedDose) {
        super(petID, name, weight, dob, accumulatedDose);
        this.breed = breed;
    }

    public Dog() {
    }
    

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    

    @Override
    public double getDose() {
        double myDog;
        if(findAge() > 12 && getWeight() < 2){
            myDog = 6 + 0.75 * getWeight();
        }else{
            myDog = 12 + 0.65 * getWeight();
        }
        if(findAge() < 3){
            return 0;
        }else if(getAccumulatedDose() >= 750){
            return 0;
        }else if(getAccumulatedDose() + myDog >= 750){
            myDog = 750 - getAccumulatedDose();
            return myDog;
        }else{
            return myDog;
        }    
    }

    @Override
    public String toString() {
        return super.toString() + "," + breed;
    }

    @Override
    public double getMaxDose() {
        return 750;
    }
    
    
}
