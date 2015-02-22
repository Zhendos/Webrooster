package org.bot.filter;

import java.io.IOException;
import java.net.URISyntaxException;

import org.bot.web.ProxyServer;

public class Filter {
	public static void getUsername() {
		
	}
	
	/**
	 * 
	 * Haalt de identieke code van de website vandaan. ( Nog niet mooi gefilterd )
	 * @return
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public static String getKey() throws IOException, URISyntaxException {
		ProxyServer.getProxy("http://webrooster.tabor.nl/");
		for(String s : ProxyServer.array){
			if(s.contains("<input type=\"hidden\" name=\"token\" value=\""))
				return s.split("<input type=\"hidden\" name=\"token\" value=\"")[1].split(">")[0];
			} 
		return null;
	}
	
}


