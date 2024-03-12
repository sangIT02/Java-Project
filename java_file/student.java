/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_file;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class student implements Serializable{
    private String name;
    private int age;
    private String add;

    public student(String name, int age, String add) {
        this.name = name;
        this.age = age;
        this.add = add;
    }

    public student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
    

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", age=" + age + ", add=" + add + '}';
    }
    
    
}
