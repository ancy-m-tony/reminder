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
 * Servlet implementation class Upload22
 */
@WebServlet("/Upload22")
public class Upload22 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String UPLOAD_DIRECTORY = "C:/uploads";
	String name;
	static String x;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload22() {
        super();
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
		doGet(request, response);
		
		 if(ServletFileUpload.isMultipartContent(request)){
				
	            try {
	
	                List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
	
	               
	
	                for(FileItem item : multiparts){
	
	                    if(!item.isFormField()){
	
	                         name = new File(item.getName()).getName();
	                         	System.out.println(name+"hello");
	                         	
	                         	x=name;
	                        item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
	
	                    }
	
	                }
	                
	                request.setAttribute("message", name+"inserted Successfully");
	    			
	            } catch (Exception ex) {
	
	               request.setAttribute("message", "File Upload Failed due to " + ex);
	
	            }         
	
	          
	
	        }else{
	
	            request.setAttribute("message",
	
	                                 "Sorry this Servlet only handles file upload request");
	
	        }
	
	     
	
	        request.getRequestDispatcher("/index.jsp").forward(request, response);
	
	
	
	}

}
