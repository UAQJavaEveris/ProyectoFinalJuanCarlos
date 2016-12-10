<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina Principal</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="index.jsp">index</a></li>
      <li><a href="actualizar.jsp">Actualizar Persona</a></li>
      <li><a href="eliminar.jsp">Eliminar Persona</a></li>
    </ul>
  </div>
</nav>
<div class="container">
<h2>Agregar una nueva persona contemporanea </h2>
<form  class="form-horizontal" action="Controller" method="Post">
<div class="form-group">
     <label class="control-label col-sm-2" for="nombre">Nombre:</label>
    <div class="col-sm-10">
    <input  class="form-control" type="txt" name="nombre"><br>
    </div>
  </div>
  <div class="form-group">
  <label  class="control-label col-sm-2" for="apellidos">Apellidos:</label>
  <div class="col-sm-10">
  <input class="form-control"  type="txt" name="apellidos"><br>
  </div>
  </div>
 <div class="form-group"> 
 <label class="control-label col-sm-2" for="logros">logros:</label>
 <div class="col-sm-10">
<input class="form-control"  type="txt" name="logros"><br>
</div>
</div>
<div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
</form>
</div>
<%
String nombre_variable = (String)session.getAttribute("exito");
%>
</body>
</html>