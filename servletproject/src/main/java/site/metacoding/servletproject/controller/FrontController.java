package site.metacoding.servletproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http 프로토콜 최초 버전 (GET)
//http1.0 프로토콜 (GET, POST)
//http1.1 프로토콜 (GET(주소요청), POST(폼코드), DELETE(자바스크립트), PUT(자바스크립트)

//http://localhost:80/fromt
@WebServlet("/front")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FrontController() {
        System.out.println("나 메모리에 떴어 : FrontController");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("front 컨트롤러로 요청들어옴.");
		
		//공통로직 처리!!
		
		//1. 라우터 만들기
		String path = request.getParameter("path");
		System.out.println("path : "+path);
		
		if(path.equals("login")) {
			response.sendRedirect("/login.jsp");
			//로그인페이지를 응답
			//PrintWriter out = response.getWriter();		
			//out.print("<!DOCTYPE html>");
			//out.print("<html>");
			//out.print("<head>");
			//out.print("<meta charset='UTF-8'>");
			//out.print("<title>Insert title here</title>");
			//out.print("</head>");
			//out.print("<body>");
			//out.print("<h1>LoginPage</h1>");
			//out.print("</body>");
			//out.print("</html>");
		}else if(path.equals("join")) {
			response.sendRedirect("/join.jsp");
			//조인페이지를 응답
			//PrintWriter out = response.getWriter();
			//out.print("<!DOCTYPE html>");
			//out.print("<html>");
			//out.print("<head>");
			//out.print("<meta charset='UTF-8'>");
			//out.print("<title>Insert title here</title>");
			//out.print("</head>");
			//out.print("<body>");
			//out.print("<h1>JoinPage</h1>");
			//out.print("</body>");
			//out.print("</html>");
		}
	}

	

}
