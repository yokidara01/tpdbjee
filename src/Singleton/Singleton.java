package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class Singleton {
    private static Connection cn=null;
    
  /*  private String  connectionString =
            "jdbc:sqlserver://su0zkl4k49.database.windows.net;" 
            + "database=mydb;"
            + "user=MyDB@su0zkl4k49@su0zkl4k49.database.windows.net;"
            + "password={Allah01mohammed};"
            + "encrypt=true;"
            + "trustServerCertificate=false;"
            + "hostNameInCertificate=*.database.windows.net;"
            + "loginTimeout=30;"; 
    */
    
    private String localDB = "jdbc:mysql://localhost/jeemaster";     
    private Singleton(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection(localDB);
        }catch(Exception e){
        	
        	e.printStackTrace();
        }
    }
    
    public static Connection getInstance(){
        if(cn==null){
            new Singleton();
        }
        return cn;
    }
    
}