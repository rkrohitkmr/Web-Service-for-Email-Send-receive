

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class printserv
 */
@WebServlet("/printserv")
public class printserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static String sub[],frm[],con[];
	int c;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public printserv(int a) {
        super();
        
       sub=new String[a];
       frm=new String[a];
       con=new String[a];
       c=a;
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		printserv ps=new printserv(c);
		for(int i=0;i<c;i++)
		{
			pw.println("Message:"+i);
			pw.println("From"+ps.frm[i]);
			pw.println("Subject"+ps.sub[i]);
			pw.println("Content"+ps.con[i]);
			pw.println();
			pw.println();
			
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
