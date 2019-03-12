/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abdullah;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah Sajid
 */
public class StarterClass {
    public static void main(String[] args) throws ClassNotFoundException{
       
         SplashScreen splash = new SplashScreen();
         splash.setVisible(true);
         LoginForm loginScreen = new LoginForm();
                    try {
                        for (int i = 0; i <= 100; i++) {
                            Thread.sleep(40);
                            splash.progressBar.setValue(i);
                            if(i==100){
                                splash.setVisible(false);
                                loginScreen.setVisible(true);
                                
                            }
                        }
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
}
