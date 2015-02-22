package org.bot.main;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.bot.filter.Filter;
import org.bot.web.OpenRooster;
import org.bot.web.OpenWebrooster;
import org.bot.web.ProxyServer;

public class Boot {
	/**
	 * 
	 * Main method.
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException{
		System.out.println(Filter.getKey());
		
		
	}

}
