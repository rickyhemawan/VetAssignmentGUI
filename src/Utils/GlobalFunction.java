/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Model.Pet;
import Model.Cat;
import Model.Dog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author ricky
 */
public class GlobalFunction {
    public static int assignPetID = 1;

    public static int getAssignPetID() {
        return assignPetID;
    }
    
    public static void incrementAssignPetID(){
        assignPetID++;
    }

    public static void setAssignPetID(int assignPetID) {
        GlobalFunction.assignPetID = assignPetID;
    }
    
    
    
    
    public static String dateToStr(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        return strDate;
    }
    
    public static Date strToDate(String strDay, String strMonth, String strYear){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String realDate = strDay + "/" + strMonth + "/" + strYear;
		Date date = new Date();
		try{
			date = formatter.parse(realDate);
		}catch (ParseException e){
			e.printStackTrace();
		}
		return date;
    }
    
    public static Date strToDate(String dob){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		try{
			date = formatter.parse(dob);
		}catch (ParseException e){
			e.printStackTrace();
		}
		return date;
    }
    
    public static String getStrDay(Date d){
        String s = dateToStr(d);
        return Character.toString(s.charAt(0)) 
                + Character.toString(s.charAt(1));
    }
    public static String getStrMonth(Date d){
        String s = dateToStr(d);
        return Character.toString(s.charAt(3)) 
                + Character.toString(s.charAt(4));
    }
    public static String getStrYear(Date d){
        String s = dateToStr(d);
        return Character.toString(s.charAt(6)) 
                + Character.toString(s.charAt(7))
                + Character.toString(s.charAt(8))
                + Character.toString(s.charAt(9));
    }
    
    public static Comparator<Pet> comparePetID(){
        return new Comparator<Pet>() {
            @Override
            public int compare(Pet t, Pet t1) {
                return t.getPetID() - t1.getPetID();
            }
        };
    }
    
    public static Comparator<Pet> comparePetTypeThenAge(){
        return new Comparator<Pet>() {
            @Override
            public int compare(Pet t, Pet t1) {
                if(t instanceof Cat && t1 instanceof Dog){
                    return -1;
                }
                else if(t instanceof Dog && t1 instanceof Cat){
                    return 1;
                }
                else if (t.getDob().after(t1.getDob())){
                    return -1;
                }
                else if(t.getDob().before(t1.getDob())){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        };
    }
    
}
