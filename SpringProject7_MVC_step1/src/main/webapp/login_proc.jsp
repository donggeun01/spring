<%@page import="com.springbook.biz.user.impl.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.springbook.biz.user.UserVO" %>
<%@ page contentType = "text/html; charset=utf-8" %>


<% 
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPassword(password);
	
	UserDAO userDAO = new UserDAO();
	UserVO user = userDAO.getUser(vo);
	
	if(user != null) {
		response.sendRedirect("getBoardList.jsp");
	}	else {
		response.sendRedirect("login.jsp");
	}
	
%>