package com.hcc.advweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentsListServlet
 */
@WebServlet("/StudentsListServlet")
public class StudentsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentsListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		ArrayList<Student> stList = StudentsList.getStudentsList();
		
		String stID = request.getParameter("id");
		String stFName = request.getParameter("fname");
		String stLName = request.getParameter("lname");
		if (stID != null && !stID.equals(null)) {
			Student student = new Student(Integer.parseInt(stID), stFName, stLName);
			stList.add(student);
		}
		out.println("<h3> The Student List for the course are given below :</h3>");
		for (Student st:StudentsList.getStudentsList()) {
			out.println("<h4>"+st.getId()+", "+st.getFname()+", "+st.getLname()+"</h4>");
		}
		out.println("<h3>Add Student to the List</h3>");
		out.println("<form method=\"get\" action=\"StudentsListServlet\">\r\n" + 
				"		Enter your ID, First Name and Last Name: <br/>\r\n" + 
				"		<input type=\"text\" name=\"id\" size=\"50\"><br/><br/>\r\n" + 
				"		<input type=\"text\" name=\"fname\" size=\"50\"><br/><br/>\r\n" + 
				"		<input type=\"text\" name=\"lname\" size=\"50\"><br/><br/>\r\n" + 
				"		<input type=\"submit\" value=\"Add Student Information\">\r\n" + 
				"	</form>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
