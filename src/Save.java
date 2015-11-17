

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import Singleton.Singleton;

/**
 * Servlet implementation class Save
 */
@WebServlet("/Save")
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Save() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Dao dao = new Dao();
		String nom,adresse,sexe,ville,daten ,code; 
		int nce ; 
		sexe=request.getParameter("sexe");
		nom=request.getParameter("nom");
		adresse=request.getParameter("ads");
		ville=request.getParameter("ville");
		code=request.getParameter("code");
		daten=request.getParameter("date");
		
		nce=Integer.parseInt(request.getParameter("nce")); 
		
		
		dao.addEtudiant(nom,ville,code,adresse,sexe,daten,nce);
		
		
		
		
		
		RequestDispatcher d=request.getRequestDispatcher("Index.jsp");
		d.forward(request, response);
    
		
		
		
		
		
	}

}
