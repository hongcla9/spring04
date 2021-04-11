<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, book.*"%>
<!-- cart.jsp -->
<%
	List<BookDTO> cart = (List)session.getAttribute("cart");
	if (cart != null && cart.size() != 0){
%>
<b>현재 주문한 도서 내역</b>
<table border="1" width="500">
	<tr>
		<th width="30%">도서명</th>
		<th width="30%">작가</th>
		<th width="15%">가격</th>
		<th width="15%">수량</th>
		<th width="10%">삭제</th>
	</tr>
<% 		java.text.DecimalFormat df = new java.text.DecimalFormat("###,###");
		for(int i=0; i<cart.size(); ++i){
			BookDTO dto = cart.get(i);%>
	<tr>
		<td align="center"><%=dto.getTitle()%></td>
		<td align="center"><%=dto.getAuthor()%></td>
		<td align="right"><%=df.format(dto.getPrice())%>원</td>
		<td align="right"><%=dto.getQty()%>권</td>
		<td>
		<form name="f" action="bookShop.do" method="post">
			<input type="hidden" name="command" value="DEL">
			<input type="hidden" name="index" value="<%=i%>">
			<input type="submit" value="삭제">
		</form>
		</td>
	</tr>		
<%		} %>
	<tr>
		<td colspan="5" align="center">
			<form name="f" action="bookShop.do" method="post">
				<input type="hidden" name="command" value="CHK">
				<input type="submit" value="결제페이지로 이동">
			</form>
		</td>
	</tr>	
<%	}%>

</table>




