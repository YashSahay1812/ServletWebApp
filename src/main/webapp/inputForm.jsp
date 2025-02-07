<!doctype html>
<html lang="en">
    <head>
        <title>Input Form</title>
        <link rel="stylesheet" href="<%= application.getContextPath() %>/css/style.css" />
    </head>
    <body>
        <%@ include file="nav.jsp" %>
        <div class="container">
            <h1>Welcome to Input Form</h1>
            <h3>We are going to send an input to server here</h3>
            <form action="<%= application.getContextPath() %>/third-servlet" method="POST">
                <input type="text" placeholder="Enter input here" name="input"/>
                <button type="submit">Submit</button>
            </form>
        </div>
    </body>
</html>