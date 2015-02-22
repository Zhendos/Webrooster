package org.bot.web;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.lang.Runtime;

public class OpenRooster {
	/**
	 * 
	 * Hiermee openen we het rooster van een lokaal bestandje.
	 * @throws IOException 
	 * 
	 */
	public static String fileLocatie;
	
	public static void openRooster(String FileLocatie) throws IOException, InterruptedException{
		File file = new File(FileLocatie);
		fileLocatie = FileLocatie;
		
		if(file.canExecute()){
			System.out.println("[SYSTEM] File is uitvoerbaar.");
			
		}
	}
	
	public static String getFileLocatie() {
		return fileLocatie;
	}
}
