<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Registration Complete</title>

</head>
<body>
<!-- Header -->
			<header id="header">
				<h1><strong><a href="home.jsp">Vacation</a></strong> in <strong><a href="home.jsp">Paradise</a></strong></h1>
				<nav id="nav">
					<ul>
						<li><a href="home.jsp">Home</a></li>
						<li><a href="details.jsp">Details</a></li>
						<li><a href="Register.jsp">Register</a></li>
					</ul>
				</nav>
			</header>

			<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

<%

String usrFirstName = (String)session.getAttribute("first_name");
usrName = request.getParameter("first_name");
session.setAttribute("first_name_atr", firstName);
out.println("First Name : "+firstName + "</br>");

String usrLastName = (String)session.getAttribute("last_name");
usrName = request.getParameter("last_name");
session.setAttribute("last_name_atr", lastName);
out.println("Last Name : "+lastName + "</br>");

 String age = request.getParameter("age");

if (Integer.parseInt(age) >= 25) {
	out.println("Would you like to book a hotel with a family?");
} else {
	out.println("Would you like to book by yourself?");
}

for (int i = 0;i<10;i++){

%>

<h1>Registration Complete!</h1>

<%
}
%>
<br/>
<a href="sample3.jsp">Next Page</a>
</body>
</html>