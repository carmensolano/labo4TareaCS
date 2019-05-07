<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>
	<form:form  action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="producto">
	
		<label>Ingrese un nombre de producto: </label>
		<form:input type="text" name="nombre" path="nombre"/>
		<form:errors path="nombre" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ingrese la marca: </label>
		<form:input type="text" name="marca" path="marca"/><br>
		<form:errors path="marca" cssStyle="color:#E81505;"></form:errors><br>
		
		
		<label>Ingrese una descripcion: </label>
		<form:input type="text" name="descripcion" path="descripcion"/>
		<form:errors path="descripcion" cssStyle="color:#E81505;"></form:errors><br><br>
		
		
		<label>Ingrese una categoria: </label>
		<form:input type="text" name="categoria" path="categoria"/>
		<form:errors path="categoria" cssStyle="color:#E81505;"></form:errors><br><br>
		
		
		<label>Ingrese un precio: </label>
		<form:input type="text" name="precio" path="precio"/>
		<form:errors path="precio" cssStyle="color:#E81505;"></form:errors><br><br>
		
		
		<label>Ingrese una fecha de vencimiento: </label>
		<form:input type="text" name="fvencimiento" path="fvencimiento"/>
		<form:errors path="fvencimiento" cssStyle="color:#E81505;"></form:errors><br><br>
		
		
			
		
		<input type="submit" value="Agregar producto">
	</form:form>

</body>
</html>