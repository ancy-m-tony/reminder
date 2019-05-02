package comp;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class Upload11
 */
@WebServlet("/Upload11")
public class Upload11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String name11=null;
	Upload22 u1=new Upload22();
	
public void get(String n) {
	name11=n;
}

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload11() {
        super();
        try {
        name11=u1.x;}
        catch(Exception e) {
        	
        }
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		 
	            
		String name1=request.getParameter("name");
		String date1=request.getParameter("date");
		String time1=request.getParameter("time");
		String type1=request.getParameter("type");
		String priority1=request.getParameter("priority");
		
		System.out.println(name1+date1+time1+type1+priority1);
		
		String driver="com.mysql.jdbc.Driver";
		java.sql.Connection conn=null;
		String url = "jdbc:mysql://localhost:3306/";;
		String db = "mydb1";
		
		try
		{
			Class.forName(driver);
			conn=java.sql.DriverManager.getConnection(url+db,"root","");
			java.sql.Statement s=null;
			
			s = conn.createStatement();
			String query="insert into remainder(name,date,time,type,priority)values('"+name1+"','"+date1+"','"+time1+"','"+type1+"','"+priority1+"')";
			s.executeUpdate(query);
			
			
			System.out.println("You are successfully registered..."); 
			
			
		}
		catch(Exception e){System.out.println(e);}
		
		       





	}

}
