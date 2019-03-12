package fr.unice.miage.tp3;

import java.security.SecureClassLoader;

public class MyClassLoader extends SecureClassLoader {  
	 private ArrayList<File> path = null;  
	 public MyClassLoader(ArrayList<File> p) {  
	   this.path = p;  
	 }  
	 @Override  
	 protected Class<?> findClass(String name) throws ClassNotFoundException {  
	   byte[] b = loadClassData(name);  
	   return super.defineClass(name, b, 0, b.length);  
	 }  
	   
	 private byte[] loadClassData(String name) throws ClassNotFoundException {  
	 // TODO  A COMPLETER    
	  return null;  
	 }  
	  
	 public static void main(String[] args) {  
	   ArrayList<File> al = new ArrayList<File>();  
	   al.add(new File(....));  
	  MyClassLoader myCL = new MyClassLoader(al);  
	  try {  
	    myCL.loadClass(...);  
	  } catch (ClassNotFoundException e) {  
	   e.printStackTrace();  
	   }  
	  }  
	}
