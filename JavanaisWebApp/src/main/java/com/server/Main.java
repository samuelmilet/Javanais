package com.server;

import org.apache.catalina.startup.Tomcat;

/**
 * 
 * @author esmi9130
 *
 */
public class Main {

	/**
	 * classe main qui me permet de lancer mon serveur tomcat
	 * @param args
	 * @throws Exception
	 */
	public static void main(final String[] args) throws Exception {
		 final Tomcat server = new Tomcat();
	        server.setPort(8090);
	        server.addWebapp("/javanais", System.getProperty("user.dir") + "/target/JavanaisWebApp.war");
	        server.start();
	 
	        // Pour bloquer l'exécution dans un main
	        server.getServer().await();	        
	}

}
