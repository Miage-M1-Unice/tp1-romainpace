package fr.unice.miage.tp2;

/**
 * @version 1.00 23 Mars 2001
 * @author Michel Buffa
 * Inspiré par la classe Reflectiontest.java de
 * Cay S. Horstmann & Gary Cornell, publiée dans le livre Core Java, Sun Press
 */

import java.lang.reflect.*;
import java.io.*;

public class AnalyseurDeClasse {

  public static void analyseClasse(String nomClasse) throws ClassNotFoundException {
    // Récupération d'un objet de type Class correspondant au nom passé en paramètres
    //Class cl = nomClasse.getClass();// CODE A ECRIRE !
	Class cl = getClasse(nomClasse);
    afficheEnTeteClasse(cl);

    System.out.println();
    afficheAttributs(cl);

    System.out.println();
    afficheConstructeurs(cl);

    System.out.println();
    afficheMethodes(cl);

    // L'accolade fermante de fin de classe !
    System.out.println("}");
  }


  /** Retourne la classe dont le nom est passé en paramètre */
  public static Class getClasse(String nomClasse) throws ClassNotFoundException {
    // CODE A ECRIRE
	 // return nomClasse.getClass();
	  return Class.forName(nomClasse);
  }

  /** Cette méthode affiche par ex "public class Toto extends Tata implements Titi, Tutu {" */
  public static void afficheEnTeteClasse(Class cl) {
    //  Affichage du modifier et du nom de la classe
    // CODE A ECRIRE
	  System.out.print(cl.getName() + " ");

   // Récupération de la superclasse si elle existe (null si cl est le type Object)
    Class supercl = cl.getSuperclass() ; // CODE A ECRIRE

    // On ecrit le "extends " que si la superclasse est non nulle et
    // différente de Object
    // CODE A ECRIRE
    if((!supercl.equals(new Object())) && (!(supercl==null)))
    	System.out.print("extends");

    // Affichage des interfaces que la classe implemente
    // CODE A ECRIRE
    Class[] interf = cl.getInterfaces();
    //System.out.print(cl.getInterfaces());
    	System.out.print(" " +interf[0]);

    // Enfin, l'accolade ouvrante !
    System.out.print(" {\n");
  }

  public static void afficheAttributs(Class cl) {
    // CODE A ECRIRE
	  Field[] fields = cl.getFields();
	  //System.out.println(cl.getFields());
	  for (int i=0; i<fields.length; i++) {
		  System.out.println(fields[i]);
	  }
  }

  public static void afficheConstructeurs(Class cl) {
    // CODE A ECRIRE
	  Constructor[] constructors = cl.getConstructors();
      //System.out.println(cl.getConstructors());
	  for (int i=0; i<constructors.length; i++) {
		  System.out.println(constructors[i]);
	  }
    }
  

  public static void afficheMethodes(Class cl) {
    // CODE A ECRIRE
    // System.out.println("{}");
	  Method[] tab = cl.getMethods();
	  for (int i=0; i<tab.length; i++)
	  {
		  System.out.println(tab[i]);
	  }
	  
	  //System.out.println(cl.getDeclaredMethods());
    }
  

  public static String litChaineAuClavier() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      return br.readLine();
  }
  
  public String toStringGeneric(Object o) {
	  //1 récupération des champs - getfields
	  //2 pour chaque champs :
	  //Type primitif : on retourne sa valeur
	  //Type tableau : compliqué (méthode annexe)
	  //Autre choix : récursif
	 
	  
	  Class fields = (Class) o;
	  Field[] f = fields.getFields();
	  //afficheAttributs(fields);
	  
	return null;
	  
  }

  public static void main(String[] args) {
    boolean ok = false;

    while(!ok) {
      try {
        //System.out.print("Entrez le nom d'une classe (ex : java.util.Date): ");
        //String nomClasse = litChaineAuClavier();

    	String nomClasse="java.awt.Point";
        analyseClasse(nomClasse);
        

        ok = true;
      } catch(ClassNotFoundException e) {
        System.out.println("Classe non trouvée.");
      }
    }
  }
}