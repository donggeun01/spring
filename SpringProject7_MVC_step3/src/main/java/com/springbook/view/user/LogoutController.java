package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.springbook.view.controller.Controller;

public class LogoutController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("로그아웃 처리 MVC프레임워크");

		HttpSession session = request.getSession();
		// 1. 釉뚮씪�슦���� �뿰寃곕맂 �꽭�뀡 媛앹껜瑜� 媛뺤젣 醫낅즺�븳�떎.
		session.invalidate();
		// 2. �꽭�뀡 醫낅즺 �썑, 硫붿씤 �솕硫댁쑝濡� �씠�룞�븳�떎.
		return "login";

	}

}