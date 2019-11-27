/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Model.Cat;
import Model.Dog;
import Model.Dose;
import Model.Pet;
import Model.VetClinic;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ricky
 */
public class VetClinicCsvRW {
    
    private static final String COMMA_SEPARATOR = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String LIST_SEPARATOR = "__DOSE__";
    
    public static final void writePetsCsv(Component component,String filename, VetClinic vetClinic){
        
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(filename);
            fileWriter.append(vetClinic.getClinicName());
            fileWriter.append(COMMA_SEPARATOR);
            fileWriter.append(Integer.toString(GlobalFunction.getAssignPetID()));
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(Pet pet : vetClinic.getPets()){
                fileWriter.append(pet.toString());
                fileWriter.append(COMMA_SEPARATOR);
                for(Dose dose : pet.getDoseList()){
                    fileWriter.append(LIST_SEPARATOR);
                    fileWriter.append(COMMA_SEPARATOR);
                    fileWriter.append(dose.toString());
                    fileWriter.append(COMMA_SEPARATOR);
                }
                fileWriter.append(NEW_LINE_SEPARATOR);
                
            }
            JOptionPane.showMessageDialog(component, "File Saving is Successful.");
        }catch(IOException e){
            JOptionPane.showMessageDialog(component, "Error Writting to CSV file!");
        }
        finally{
            try{
                    fileWriter.flush();
                    fileWriter.close();
            }catch (Exception e) {
                    System.out.println("Error flush!!");
            }
	}
        
    }
    
    public static VetClinic readCsvFile(Component component, String fileName){
        BufferedReader fileReader = null;
        VetClinic clinic = new VetClinic("");
        try{
            
            ArrayList<Pet> pets = new ArrayList<>();
            ArrayList<Dose> doses;
            String line = "";
            fileReader = new BufferedReader(new FileReader(fileName));
            String[] firstLine = fileReader.readLine().split(COMMA_SEPARATOR);
            clinic.setClinicName(firstLine[0]);
            GlobalFunction.setAssignPetID(Integer.parseInt(firstLine[1]));
            while((line = fileReader.readLine()) != null){
                Pet onePet;
                doses = new ArrayList<>();
                String[] oneLine = line.split(COMMA_SEPARATOR);
                if(oneLine[5].equalsIgnoreCase("true") || oneLine[5].equalsIgnoreCase("false")){
                    onePet = new Cat();
                }else{
                    onePet = new Dog();
                }
                for(int i = 0; i < oneLine.length; i++){
                    switch(i){
                        case 0: onePet.setPetID(Integer.parseInt(oneLine[i])); break;
                        case 1: onePet.setName(oneLine[i]); break;
                        case 2: onePet.setWeight(Double.parseDouble(oneLine[i])); break;
                        case 3: onePet.setDob(GlobalFunction.strToDate(oneLine[i])); break;
                        case 4: onePet.setAccumulatedDose(Double.parseDouble(oneLine[i])); break;
                        case 5: 
                            if(onePet instanceof Cat){
                                if(oneLine[i].equalsIgnoreCase("true")){
                                    ((Cat) onePet).setAllergic(true);
                                }
                                else{
                                    ((Cat) onePet).setAllergic(false);
                                }
                            }else{
                                ((Dog) onePet).setBreed(oneLine[i]);
                            }
                            break;
                        default:
                            if(oneLine[i].equalsIgnoreCase(LIST_SEPARATOR)){
                                Dose dose = new Dose(oneLine[i+1],
                                        GlobalFunction.strToDate(oneLine[i+2]),
                                        Double.parseDouble(oneLine[i+3]));
                                doses.add(dose);
                            }    
                    }
                }
                onePet.setDoseList(doses);
                pets.add(onePet);
            }
            clinic.setPets(pets);
            return clinic;
            
            
        }catch (IOException | NumberFormatException e) {
            System.out.println(e);
            JOptionPane.showConfirmDialog(component, "Error");
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                JOptionPane.showConfirmDialog(component, "Error while closing fileReader !!!");
            }
        }
        return clinic;
    }
    
}
