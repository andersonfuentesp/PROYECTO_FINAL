<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MARKETAPP</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"> 
    </head>
    <body>
        <form class="login-form" action="InicioSesion">
            <div class="login-box"> 
                <img class="avatar" src="imagenes/foto.png" alt="Marketapp">
            </div>
            <br><br>
            <div class="login-box">
                <h1>Bienvenido a Marketapp</h1>
            </div>
            <input type="text" name="usuario"class="login-username" autofocus="true" required="true" placeholder="Nombre de usuario" />
            <input type="password" name="pass" class="login-password" required="true" placeholder="Contraseña" />
            <div class="registro">
                <a href="registrarse.jsp">¿Sin cuenta aún? Crea una ahora.</a>
            </div>
            <input type="submit" name="Login" value="Ingresar" class="login-submit" />
        </form>
          <a href="olvidastepass.jsp" class="login-forgot-pass">¿Olvidaste tu contraseña?</a>
          <div class="underlay-photo"></div>
          <div class="underlay-black"></div> 
    </body>
</html>
