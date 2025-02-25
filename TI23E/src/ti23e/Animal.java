/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti23e;

/**
 *
 * @author komputer 35
 */
public class Animal {
    String gender;
    String classified;
    String name;
    
    public Animal(){
        gender = "Male";
        classified = "Reptil";
        name = "";
    }
    
    public void setAnimal(String gender, String classified, String name){
            this.gender = gender;
            this.classified = classified;
            this.name = name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getClassified(){
        return classified;
    }
    
    public String getName(){
        return name;
    }
            
}
