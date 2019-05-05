
package controller;

import java.io.IOException;
import java.io.PrintWriter;
/*
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
*/
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
*/
import DAO.ContatoDAO;
import VO.ContatoVO;

/**
 * Servlet implementation class ControllerAJAX
 */
@WebServlet("/ControllerAJAX")
public class controllerAJAX extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        PrintWriter out = response.getWriter();

      
        String nome = request.getParameter("nome");
       // String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");
       // String dataEmTexto = request.getParameter("dataNascimento");
        

        ContatoVO a = new ContatoVO(nome,email);
        ContatoDAO cont = new ContatoDAO();
        
       cont.addPeople(a);
        
        out.println("<html>");
        out.println("<body>");
       out.println("Nome: " + nome + "Email: " + email);
        //out.println("Nome: "); 
        out.println("</body>");
        out.println("</html>");
        
    }
		
}
