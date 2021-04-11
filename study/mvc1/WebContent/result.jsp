<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*"%>
<!-- result.jsp -->
<%
	List<String> advice = (List)request.getAttribute("advice");
	out.println("<h2>선택하신 학과의 도움말</h2>");
	for(String msg : advice){
		out.println("<h2>" + msg + "<h2>");
	}
%>