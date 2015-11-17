

import model.etudiant;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;



/**
 * Servlet implementation class Afficher
 */
@WebServlet("/Afficher")
public class Afficher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Afficher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String req="Select * from etudiant " ; 
		ArrayList<etudiant> l = new ArrayList<etudiant>() ; 
		String localDB = "jdbc:mysql://localhost/jeemaster";     
		   Connection cn =null;
		        try{
		        Class.forName("com.mysql.jdbc.Driver");
		       cn= DriverManager.getConnection(localDB,"root","");
		       
         Statement st = cn.createStatement();
	         System.out.print(req);
         
         
	         java.sql.ResultSet rs = st.executeQuery(req);
	         String nom,adresse,sexe,ville,daten ,code; 
	 		int nce ; 
	 		
	 		
	         while (rs.next())
	         {  
	        	 etudiant etud = new etudiant() ; 
	        	nce = Integer.parseInt(rs.getString(1)) ;
	        	nom= rs.getString(2) ; 
	        	ville=rs.getString(3) ; 
	        	daten=rs.getString(4) ; 
	        	sexe=rs.getString(5) ;
	        	adresse=rs.getString(6) ; 
	        	 
	        	
	        	
	        	code=rs.getString(7) ; 
	        	
	        	etud.nce= nce ; 
	        	etud.nom= nom ; 
	        	etud.adresse= adresse ; 
	        	etud.sexe= sexe ; 
	        	etud.ville= ville ; 
	        	etud.daten= daten ; 
	        	
	        	
	       	 switch (code) {
	         case "01":  code = "MDW";
	                  break;
	         case "02":  code = "RSI";
	         break;
	         
	         case "03":  code = "DSI";
	         break;
	         case "04":  code = "SEM";
	         break;
	     }etud.code= code ; 
	        	l.add(etud) ; 
	        	
	        	
	        	
	         }
		        }catch(Exception e){ e.printStackTrace();}
		
		// TODO Auto-generated method stub
		        

	        	
	        	HttpSession session = request.getSession();
	        	session.setAttribute("list", l);
	RequestDispatcher d=request.getRequestDispatcher("Fiche.jsp");
	    		d.forward(request, response);}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// TODO Auto-generated method stub
	}

}
