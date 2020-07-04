
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    HttpSession objsesion= request.getSession(false);
    String usuario= (String)objsesion.getAttribute("usuario");
    if(usuario.equals("")){
        response.sendRedirect("index.jsp");
    }
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido <% out.println(usuario); %>al sistema</h1>
    </body>
</html>
