package com.uexcel;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class EndServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		Cookie[] cks = req.getCookies();
		for (Cookie n : cks) {
			if (n.getName().equals("k")) {
				int k = Integer.parseInt(n.getValue());
				int j = k * k;
				out.println(j);
				break;
			}
		}

	}
}
