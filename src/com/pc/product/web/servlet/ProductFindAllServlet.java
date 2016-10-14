package com.pc.product.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pc.product.domain.Product;
import com.pc.product.service.ProductService;

public class ProductFindAllServlet extends HttpServlet {
	private static final long serialVersionUID = 26291109274917906L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		try {
			List<Product> allProduct = new ProductService().findAllProduct();
			request.setAttribute("allProduct", allProduct);
			request.getRequestDispatcher("/WEB-INF/order_list.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}