/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class StudentManager implements Student_Interface {

    private List<Student> list;

    public StudentManager() {
        list = new ArrayList<>();
    }

    public StudentManager(List<Student> list) {
        this.list = list;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    @Override
    public void Add() {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter ID: ");
        String id = ip.nextLine();
        System.out.print("Enter Name: ");
        String name = ip.nextLine();
        System.out.print("Enter Age: ");
        String age = ip.nextLine();
        System.out.print("Enter GPA: ");
        String gpa = ip.nextLine();
        Student s = new Student(id, name, age, gpa);
        list.add(s);

    }

    @Override
    public void Update(String id) {
        Scanner ip = new Scanner(System.in);
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getId().equals(id)) {
                System.out.print("Enter ID: ");
                String idn = ip.nextLine();
                s.setId(idn);
                System.out.print("Enter Name: ");
                String name = ip.nextLine();
                s.setName(name);
                System.out.print("Enter Age: ");
                String age = ip.nextLine();
                s.setAge(age);
                System.out.print("Enter GPA: ");
                String gpa = ip.nextLine();
                s.setGpa(gpa);
                return;
            }
        }
    }

    @Override
    public void Del(String id) {
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            if(s.getId().equals(id)){
                list.remove(s);
                return;
            }
        }
    }

    @Override
    public void Search(String name) {
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            if(s.getName().equals(name)){
                System.out.println(s.toString());
            }
        }
    }

    @Override
    public void readfile(File f) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Student> list_Student = new ArrayList<>();
            while(fis.available() > 0){
                Student s = (Student) ois.readObject();
                list_Student.add(s);
            }
            setList(list_Student);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void Writefile(File f) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            oos.writeObject(s);
        }
        oos.close();
        fos.close();
    }
    public void hienthi(){
        for (Student s : list) {
            System.out.println(s.toString());
        }
    }
}
