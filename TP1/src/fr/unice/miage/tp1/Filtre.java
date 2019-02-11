package fr.unice.miage.tp1;

import java.io.File;
import java.io.FilenameFilter;

public class Filtre implements FilenameFilter{

	//private File file;
	//String repertoire= ".";
	
	public Filtre() {
	}
	
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		File[] listefichier = dir.listFiles();
		
		for (File rep : listefichier)
		{
			if(rep.getName()==name)
				return true;
		}
		return false;
	}
	
	
}
