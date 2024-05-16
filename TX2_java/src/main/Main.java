/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File dat = new File("data.dat");
        Scanner ip = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        int lc;
        do{
            System.out.println("1. Them student\n"
                    + "2. Sua student\n"
                    + "3. Xoa student\n"
                    + "4. Search student\n"
                    + "5. readfile\n"
                    + "0. thoat");
            lc = Integer.parseInt(ip.nextLine());
            if(lc == 1){
                sm.Add();
                sm.Writefile(dat);
            }
             if(lc == 2){
                System.out.print("- Enter id:");
                String id = ip.nextLine();
                sm.Update(id);
                sm.Writefile(dat);
            }
             if(lc == 3){
                System.out.print("- Enter id:");
                String id = ip.nextLine();
                sm.Del(id);
                sm.Writefile(dat);
            }
             if(lc == 4){
                System.out.print("- Enter name:");
                String name = ip.nextLine();
                sm.Search(name);
         
            }
             if(lc == 5){
                sm.readfile(dat);
            }
             if(lc == 6){
                sm.hienthi();
            }
        }while(lc != 0);
    }
    
}
