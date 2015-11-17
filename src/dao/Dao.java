package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Singleton.Singleton; 

public class Dao {

	public int addEtudiant(String nom ,String ville,String code,String adresse,String sexe ,String daten, Integer nce)
	{
	
		 String req = " Insert into etudiant(nce,nom,ville,daten,sexe,adress,idclass) values("
	             +nce+","
	              +"'"+nom+"',"
	               +"'"+ville+"',"
	                +"'"+daten+"',"
	                 +"'"+sexe+"',"
	                  +"'"+adresse+"',"
	                  +"'"+code+"')";
	 
	  int res=0;
	   String localDB = "jdbc:mysql://localhost/jeemaster";     
	  		   Connection cn =null;
	  		        try{
	  		        Class.forName("com.mysql.jdbc.Driver");
	  		       cn= DriverManager.getConnection(localDB,"root","");
	  		       
	            Statement st = cn.createStatement();
		         System.out.print(req);
	            
	            
		         res= st.executeUpdate(req);
		         System.out.println(res+" Etudiant ajouté ");
		          
	        }
	
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	return res ; 
	
	}


	public void test()
	{

Singleton	 cnx = null ;
Connection cn= Singleton.getInstance();
Statement stmt = null ; 
      
      String sql = "CREATE TABLE REGISTRATION " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 

      try {
		stmt.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
