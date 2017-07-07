<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<title>Initial Page</title>
</head>
<body>
	<h2>Hello World!</h2>
	<p><a href="<s:url action='hello'/>">Hello World</a></p>
	
<!--	<s:url action="helloSweety" var="helloSweetyLink">
		<s:param name="userName">Maddy</s:param>
	</s:url>
-->	<p><a href="<s:url action="helloSweety">
		<s:param name="userName">Maddy</s:param>
	</s:url>">Hello Sweety</a></p>
		
	<p>Put your name to get a personal hello.</p> 
	<s:form action="helloUser"> 
	  <s:textfield name="userName" label="Your name" />     
	  <s:submit value="Submit" /> 
	</s:form>

	
</body>
</html>
