<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="Texto" type="String" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Proprietarios</title>
    </head>
    <body>
    <center> <h1>Proprietario</h1></center>
        
   
        ${Texto}
    </body>
</html>
