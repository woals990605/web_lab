package site.metacoding.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import site.metacoding.mvc.web.MyUserController;

// http://localhost:8000/
// http://localhost:8000/hello
// 슬래쉬만 적어놓으면 뒤에 뭐가오든 이쪽으로 들어옴

// http://localhost:8000/myuser가 들어오면 유저 컨트롤러로 가게 파싱 해줘야함
// http://localhost:8000/mypost가 들어오면 포스트 컨트롤러로 가게 파싱 해줘야함

@WebServlet("/") // 어떤 요청이 들어와도 이 서블릿이 받음
public class DispatcherServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String domain = request.getRequestURI();

        System.out.println("domain : " + domain);

        if (domain.equals("/myuser")) {
        	System.out.println("컨트롤러 생성 전");
            MyUserController controller = new MyUserController(request, response);
        	System.out.println("컨트롤러 생성 후 ");
            // int id = Integer.parseInt(request.getParameter("id"));
        	String idStr = request.getParameter("id"); // null
        	

        	// http://localhost:8000/myuser
            System.out.println("getAll 실행됨");
            if (idStr == null) {
                controller.getAll();
            } else {
            	int id = Integer.parseInt(idStr);
                controller.getOne(id);
            }
        }
    }// Dispatcher 스레드가 종료 (1. 클라이언트에게 연결된 response 선 짤림, 2. request 메모리영역 삭제, DB connection 반납)

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }// Dispatcher 스레드가 종료

}