<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>所有商品</title>
	</head>
	<body>
		<div align="center">
			<h2>所有商品</h2>
			<table border="1px" cellpadding="0px" cellspacing="0px" width="700px">
				<tr>
					<th>ID</th>
					<th>商品名</th>
					<th>价格</th>
					<th>描述</th>
				</tr>
				<c:if test="${!empty allProduct}">
					<c:forEach items="${allProduct }" var="product">
						<tr>
							<td>${product.pid }</td>
							<td>${product.pname }</td>
							<td>${product.price }</td>
							<td>${product.pdesc }</td>
						</tr>
					</c:forEach>
				</c:if>
			</table>
		</div>
	</body>
</html>