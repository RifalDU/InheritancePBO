/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti23e;

/**
 *
 * @author komputer 35
 */
public class Crocodile extends Animal {
    int age;
    public Crocodile(int age) {
        super.name = "Crocodile";
        this.age = age;
        super.classified = "Reptile";
    }
    
    public void info(){
        System.out.println("My name is:" + super.name);
        System.out.println("Classified :" + super.classified);
        System.out.println("Age :" + getAge());
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }

}
