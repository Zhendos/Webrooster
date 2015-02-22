package org.bot.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class ProxyServer {
	public static Proxy proxy;
	public static URL url;
	public static URLConnection connection;
	
	public static BufferedReader br;
	public static InputStream in;
	public static String line;
	
	public static ArrayList<String> array = new ArrayList<String>();	
	
	public static void getProxy(String website) throws IOException, URISyntaxException {
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("217.23.8.145", 31241));
		url = new URL(website);
		connection = url.openConnection();
		
		System.out.println("[SYSTEM] De connectie met " + url.toURI() + " wordt nu geopend.");

		
		in = connection.getInputStream();
		br = new BufferedReader(new InputStreamReader(in));
		
		while((line = br.readLine()) != null){
			array.add(line);
		}
		System.out.println("[SYSTEM] Klaar met het lezen van de website.");
		System.out.println("[SYSTEM] Sluit nu de connectie met de website.");
		br.close();
		
		System.out.println("[SYSTEM] De connectie met de website is succesvol gesloten.");
		
		
	}

}
