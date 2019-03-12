package fr.unice.miage;

import java.net.URL;
import java.net.URLClassLoader;

public class Main {
	

	public Main() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		
		URL[] url = new URL[](new URL("file:///home/romainpace/eclipse-workspace/Projet1/bin/"));
		URLClassLoader urlclass = new URLClassLoader(url);
		Class<?> cl = urlclass.loadClass("fr.unice.miage.Test");
		
	}
}
