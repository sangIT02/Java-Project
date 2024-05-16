/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main;

import java.io.File;

/**
 *
 * @author PC
 */
public interface Student_Interface {
    public void Add();
    public void Update(String id);
    public void Del(String id);
    public void Search(String name);
    public void readfile(File f);
}
