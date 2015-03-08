package org.bot.local;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Local {
	public final static String versie = "0.1";
	
	public static Date date = new Date();
	public static String datum = new SimpleDateFormat("yyyy.MM.dd  HH:mm").format(date);
	public static String tijd = new SimpleDateFormat("H:m").format(date);
	
	

}
