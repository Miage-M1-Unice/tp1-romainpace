package fr.unice.miage.tp1;

import java.io.File;
import java.io.FilenameFilter;

public class Repertoire {
	//private File file;

	public Repertoire() {
		
	}
	
	private void parcoursAvance(File file) {
		File[] listeFichier2 = file.listFiles();
		for (File rep : listeFichier2)
		{
			if (rep.isDirectory())
				parcoursAvance(rep);
			else
				System.out.println(rep);
		}
	}

	public static void main(String[] args) {
		Filtre filtre;
		Repertoire rep = new Repertoire();
		
		//Question 1 :
		
		String repertoire= ".";
		File file = new File(repertoire);
		String[] listeFichier = file.list();
		
		for (int i=0; i<listeFichier.length; i++)
		{
			System.out.println(listeFichier[i]);
		}
		
		//Question 2 :
		rep.parcoursAvance(file);

		//Question 3 :
		
		

	}


}
