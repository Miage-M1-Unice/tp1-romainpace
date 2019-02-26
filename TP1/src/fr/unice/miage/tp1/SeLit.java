package fr.unice.miage.tp1;

import java.io.File;  
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;   
  

public class SeLit {  
	
   public SeLit() {
		
	}

void lecture(Scanner source) {  
  
       while(source.hasNextLine()) {  
           String s = source.nextLine();
           System.out.println("test");
           System.out.println(s);
           //System.out.println(\"LU:\" +s);  
           // A modifier  
        		   
        		   
       }  
   }  
  
   static public void main(String[] args) throws IOException {   
      // A compléter  
	   File fichier = new File("src/fr/unice/miage/tp1/SeLit.java");
	   Writer w= new FileWriter(fichier);
	   PrintWriter pw= new PrintWriter(w);
	   
	   Scanner source = new Scanner(fichier);
	   //System.out.println(fichier.toString());
	   
	   SeLit sl = new SeLit();
	   sl.lecture(source);
	   
	   
	   //String texte = 
	   //FileWriter fw= new FileWriter(texte);
   }  
}  