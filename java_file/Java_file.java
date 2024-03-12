/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author PC
 */
public class Java_file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        try {
//            File f = new File("C:\\Users\\PC\\OneDrive\\Desktop\\Swing_Java\\java_file\\outputdata.txt");
//        
//            InputStream is = new FileInputStream(f);
//            ObjectInputStream ois = new ObjectInputStream(is);
//            student s = (student)ois.readObject();
//            System.out.println(s.toString());
//            System.out.println(s.getName());
//            ois.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            File f = new File("C:\\Users\\PC\\OneDrive\\Desktop\\Swing_Java\\java_file\\outputdata.txt");
            OutputStream os = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            student s = new student("sang", 20, "hb");
            
            oos.writeObject(s);
            oos.flush();
            oos.close();
        } catch (Exception e) {
        }

    }

}
