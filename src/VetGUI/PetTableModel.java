/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VetGUI;

import Utils.GlobalFunction;
import Model.Pet;
import Model.Cat;
import Model.Dog;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ricky
 */
public class PetTableModel extends AbstractTableModel {
    
    private ArrayList<Pet> pets;
    private String[] columnNames= {"Pet ID", "Name", "Weight", "Date of Birth", "Accumulated Dose(mg)", "Allergic (Cat) / Breed (Dog)"};

    public PetTableModel(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
        fireTableDataChanged();
    }
    
    
    @Override
    public int getRowCount() {
        return pets.size();
    }

    @Override
    public int getColumnCount() {
        return 6;

    }

    @Override
    public Object getValueAt(int i, int i1) {
        Pet pet = pets.get(i);
        switch(i1){
            case 0 : return pet.getPetID();
            case 1 : return pet.getName();
            case 2 : return pet.getWeight();
            case 3 : return GlobalFunction.dateToStr(pet.getDob());
            case 4 : return pet.getAccumulatedDose();
            case 5 :
                if(pet instanceof Dog){
                    return ((Dog)pet).getBreed();
                }
                else{
                    if(((Cat)pet).isAllergic()){
                        return "Yes";
                    }
                    else{
                        return "No";
                    }
                }
            default : return null;
        }

    }
    
    public void addPet(Pet p){
        getPets().add(p);
        fireTableDataChanged();
    }
    
    public void deletePet(int i){
        getPets().remove(i);
        fireTableDataChanged();
    }
    
    public Pet getSelectedPet(int i){
        return pets.get(i);
    }
    
    public void updatePet(Pet p){
        for(int i = 0; i < pets.size(); i++){
            if(pets.get(i).getPetID() == p.getPetID()){
                pets.remove(i);
                pets.add(p);
                fireTableDataChanged();
                break;
            }
        }
    }
    
    public void sortPetAccumulatedDose(){
        Collections.sort(getPets());
        fireTableDataChanged();
    }
    
    public void sortByID(){
        Collections.sort(getPets(), GlobalFunction.comparePetID());
        fireTableDataChanged();
    }
    
    public void sortByTypeThenAge(){
        Collections.sort(getPets(), GlobalFunction.comparePetTypeThenAge());
        fireTableDataChanged();
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
}
