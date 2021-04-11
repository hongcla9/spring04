<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, book.*"%>
<!-- result.jsp -->
<%
	Map<String, BookDTO> map = (Map)request.getAttribute("order");
%>
<html>
<head>
	<title>주문내역서</title>
</head>
<body>
	<div align="center">
		<hr color="green" width="300">
		<h2>도 서 주 문 내 역 서</h2>
		<hr color="green" width="300">
		<table border="1" width="500">
			<tr>
				<th width="30%">도서명</th>
				<th width="25%">작가</th>
				<th width="15%">단가</th>
				<th width="15%">수량</th>
				<th width="15%">금액</th>
			</tr>
<%		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			BookDTO dto = map.get(it.next());%>
			<tr>
				<td><%=dto.getTitle()%></td>
				<td><%=dto.getAuthor()%></td>
				<td><%=dto.getPrice()%></td>
				<td><%=dto.getQty()%></td>
				<td><%=dto.getPrice()*dto.getQty()%></td>
			</tr>
<%		} %>					
		</table>
	</div>
</body>
</html>
