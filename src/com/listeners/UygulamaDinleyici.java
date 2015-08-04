package com.listeners;

import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class UygulamaDinleyici
 *
 */
@WebListener
public class UygulamaDinleyici implements ServletContextListener {

    
    public UygulamaDinleyici() {
        // TODO Auto-generated constructor stub
    }

	
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("Uygulama Sonlandi"+new Date());
    	
    }

	
    public void contextInitialized(ServletContextEvent arg0)  { 
         // Uygulamanin basladigi yer
    	System.out.println("Uygulama Basladi"+new Date());
    }
	
}
