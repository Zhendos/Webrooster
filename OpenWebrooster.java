package org.bot.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class OpenWebrooster {
	/**
	 * 
	 * Fields
	 * 
	 */
	public static URL url;
	public static URLConnection connection;
	public static BufferedReader reader;
	public static InputStream in;
	
	
	public static void openWebrooster(String website) throws IOException {
		url = new URL(website);
		
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("198.57.208.244", 8080));
		System.out.println("[SYSTEM] De connectie met " + url.toString() + " wordt nu geopend.");
		
		connection = url.openConnection();
		
		System.out.println("[SYSTEM] De connectie is geopend!");
		
		
	}

}
