/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abdullah;

import java.io.File;
import java.sql.*;
// or we can use
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

/**
 *
 * @author Abdullah Sajid
 */
public class SQLiteConnectivity {
    
    private Connection connection=null;
    
    

    public Connection connect() throws ClassNotFoundException{
    // load the sqlite-JDBC driver using the current class loader
        Class.forName("org.sqlite.JDBC");
        try{
            // we use either getPath(), getAbsolutePath() or getCanonicalPath() to get any path
            // i.e File file = new File("src/com/database")
            // file.getath(); // relative path
            // or file.getAbsolutePath(); it is an absolute path
            // or file.getCanonicalPath(); canonical path is always an absolute path but it is always unique. i.e. there is only one canonical path to every path
            // to see the current directory path we use System.out.println(System.getProperty("user.dir")); or System.out.println(new File(".").getCanonicalPath());
            // we can use "../" to go back one directory. by default current directory points to root folder of the project  
            // create a database connection
              
              // we can give path to sqlite file in two ways
              // 1. "jdbc:sqlite::resource:DatabaseFile" this way, we can also access slite file through project jar file
              // 2. "jdbc:sqlite:DatabaseFile" this way, we can only access sqlite file in this project, not through jar file
              // follow https://stackoverflow.com/questions/12019974/how-to-include-sqlite-database-in-executable-jar for more info
              
              String serverUrl="jdbc:sqlite:ssglite.db";
//              String userName="sa";
//              String passWord="abdullah242";
              // to connect database without username and password
//              connection = DriverManager.getConnection("jdbc:sqlite:test.db");
             // we are not authenticating database with username and password
             connection = DriverManager.getConnection(serverUrl);
             if(connection != null){
              System.out.println("SQLite Database Connected Successfully");
             }
          
           }
         catch(SQLException e)
          {
            // connection close failed.
            System.err.println(e);
          }
          return connection;
    }
    
    public void disconnect() {
  
        try
        {
          if(connection != null)
            connection.close();
        }
        catch(SQLException e)
        {
          // connection close failed.
          System.err.println(e);
        }
    }
    
  
}