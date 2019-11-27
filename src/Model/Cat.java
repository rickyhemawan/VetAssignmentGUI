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
public class Cat extends Pet{
    private boolean allergic;

    public Cat(boolean allergic, int petID, String name, double weight, Date dob, double accumulatedDose) {
        super(petID, name, weight, dob, accumulatedDose);
        this.allergic = allergic;
    }

    public Cat() {
    }
    

    public boolean isAllergic() {
        return allergic;
    }

    public void setAllergic(boolean allergic) {
        this.allergic = allergic;
    }

    @Override
    public double getDose() {
        double myCat;
        if(findAge() > 3 && getWeight() > 0.5){
            myCat =  7 + 0.61 * getWeight();
        }else{
            myCat = 0.81 * getWeight();
        }

        if(isAllergic()){
            return 0;
        }else if(getAccumulatedDose() >= 500){
            return 0;
        }else if(myCat + getAccumulatedDose() >=500){
            myCat = 500 - getAccumulatedDose();
            return myCat;
        }else{
            return myCat;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "," + allergic;
    }

    @Override
    public double getMaxDose() {
        return 500;
    }
    
}
