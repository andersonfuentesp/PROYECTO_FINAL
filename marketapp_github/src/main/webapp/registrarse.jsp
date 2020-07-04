<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRARSE</title>
        <link href="css/estilos_1.css" rel="stylesheet" type="text/css"> 
    </head>
    <body>
        <form class="login-form" action="RegistroClientes">
            <div class="login-box"> 
                <img class="avatar" src="imagenes/foto.png" alt="Marketapp">
            </div>
            <br><br><br>
            <div class="login-box">
                <h1>REGÍSTRATE EN MARKETAPP</h1>
            </div>
            <input type="text" name="txtnombre" class="login-username" autofocus="true" required="true" placeholder="Nombres" />
            <input type="text" name="txtapellido" class="login-username1" autofocus="true" required="true" placeholder="Apellidos" />
            <input type="text" name="txtusername" class="login-username1" autofocus="true" required="true" placeholder="Nombre de usuario" />
            <input type="email" name="txtcorreo" class="login-username2" autofocus="true" required="true" placeholder="Correo electrónico" />
            <input type="password" name="txtpass" class="login-password" required="true" placeholder="Contraseña" />
            <div class="link-registro"> 
            <a href="index.jsp">¿Tienes una cuenta? Accede</a>
            </div>
            <br>
            <input type="submit" name="Login" value="Registrarse" class="login-submit" />
        </form>
          <div class="underlay-photo"></div>
          <div class="underlay-black"></div> 
    </body>
</html>


