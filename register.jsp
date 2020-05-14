<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<!--
	Spatial by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>Vacation in Paradise</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
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

		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="container">
					<header class="major special">
						<h2>Book Trip</h2>
						<p>Sign up for the vacation of your life</p>
					</header>
					
					<!-- Table -->
						<section>
							<h3>Pricing</h3>
							<div class="table-wrapper">
								<table class="alt">
									<thead>
										<tr>
											<th>Name</th>
											<th>Description</th>
											<th>Price</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>One Day</td>
											<td>Per person, per day</td>
											<td>$158</td>
										</tr>
										<tr>
											<td>One Week</td>
											<td>Per person</td>
											<td>$1,109</td>
										</tr>
										<tr>
											<td>One Month</td>
											<td>Per person</td>
											<td>$4,751</td>
										</tr>
										<tr>
											<td>One Week</td>
											<td>For a couple</td>
											<td>$2,217</td>
										</tr>
										<tr>
											<td>One Month</td>
											<td>For a couple</td>
											<td>$9,502</td>
										</tr>
								</table>
							</div>
						</section>

					<!-- Form -->
						<section>
							<h3>Book now:</h3>
							<form name="sampleform" method="get" action="register_complete.jsp">
								<div class="row uniform 50%">
									<div class="6u 12u$(xsmall)">
										<input type="text" name="first_name" id="first_name" value="" placeholder="First Name" />
									</div>
									<div class="6u 12u$(xsmall)">
										<input type="text" name="last_name" id="last_name" value="" placeholder="Last Name" />
									</div>
									<div class="6u 12u$(xsmall)">
										<input type="text" name="age" id="age" value="" placeholder="Age" />
									</div>
									<div class="6u 12u$(xsmall)">
										<input type="text" name="gender" id="gender" value="" placeholder="Gender" />
									</div>
									<div class="6u 12u$(xsmall)">
										<input type="text" name="address" id="address" value="" placeholder="Address" />
									</div>
									<div class="6u 12u$(xsmall)">
										<input type="text" name="city" id="city" value="" placeholder="City" />
									</div>
									<div class="6u 12u$(xsmall)">
										<input type="text" name="state" id="state" value="" placeholder="State" />
									</div>
									<div class="6u$ 12u$(xsmall)">
										<input type="email" name="email" id="email" value="" placeholder="Email" />
									</div>
									<div class="12u$">
										<div class="select-wrapper">
											<select name="category" id="category">
												<option value="">- Type -</option>
												<option value="1">One Day for a person</option>
												<option value="1">One Week for a person</option>
												<option value="1">One Month for a person</option>
												<option value="1">One Week for a couple</option>
												<option value="1">One Month for a couple</option>
											</select>
										</div>
									</div>
									<div class="12u$">
										<textarea name="message" id="message" placeholder="Enter your message" rows="6"></textarea>
									</div>
									<div class="12u$">
										<ul class="actions">
											<li><input type="submit" value="Send Message" class="special" /></li>
											<li><input type="reset" value="Reset" /></li>
											<li><input type="edit" value="Edit" /></li>
										</ul>
									</div>
								</div>
							</form>
							<c:out value="Register... "/>
							<c:set var="radius" value="2.15" scope="page"/>
							<c:choose>
								<c:when test="${param.number1>25}">
								<c:out value="Welcome to paradise!"/>
								</c:when>
								<c:otherwise>
									<c:out value="Please register"/>
								</c:otherwise>
							</c:choose>

							<c:out value="${radius}"/>
							<%= new java.util.Date() %>
						</section>

					

				</div>
			</section>

		<!-- Footer -->
			<footer id="footer">
				<div class="container">
					<ul class="icons">
						<li><a href="#" class="icon fa-facebook"></a></li>
						<li><a href="#" class="icon fa-twitter"></a></li>
						<li><a href="#" class="icon fa-instagram"></a></li>
					</ul>
					<ul class="copyright">
						<li>&copy; Untitled</li>
						<li>Design: <a href="http://templated.co">TEMPLATED</a></li>
						<li>Images: <a href="http://unsplash.com">Unsplash</a></li>
					</ul>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>