/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_step_01;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rafaq
 */
public class sourcecode {
   public String text;
   public String fp = "F:\\BSCS\\Smester 05 Fall 2020\\CSC3201 Compiler Construction\\project_step_01\\cc.txt";
    File file = new File(fp);
 public void writecode(){
    
    
     System.out.println("Enter text");
     Scanner input = new Scanner(System.in);
     text = input.nextLine();
     try{
     FileWriter fw = new FileWriter(file); 
   fw.write(text);
   fw.close();

    
     }catch(IOException e){
         System.out.println("Error occured");
         e.printStackTrace();
     }
  }
 public void readcode(){
     System.out.println(" Reading From File");
     try{
     Scanner scan = new Scanner(file);
    while(scan.hasNextLine()){
        text = scan.nextLine();
        
    } 
     }catch(FileNotFoundException e){
         System.out.println("Error occured");
     }
     System.out.println("Writing onto output screen");
     for(int i = 0;i<text.length();i++){
         char element = text.charAt(i);
         System.out.println(element);
     }
 }
}
