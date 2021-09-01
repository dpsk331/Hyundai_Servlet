package com.mycompany.webapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ch01Controller {
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Ch01Contorller-exec()");
		return "ch01/content";
	}
}