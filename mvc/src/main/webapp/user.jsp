<%@page import="site.metacoding.mvc.domain.MyUser"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	List<MyUser>myUsers =(List<MyUser>)request.getAttribute("myUsers");
	for (int i = 0; i < myUsers.size(); i++) {
		
	%>
	아이디 : <%=myUsers.get(i).getId() %><br/>
유저네임 : <%=myUsers.get(i).getUsername() %><br/>
비밀번호 : <%=myUsers.get(i).getPassword() %><br/>
이메일 : <%=myUsers.get(i).getEmail() %><br/>
	<%
	}
	%>
</body>
</html>