<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js "></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

<meta charset="ISO-8859-1">
<title>AJAX</title>

	


</head>
<body>
                <form action="ControllerAJAX"> <!-- Nome do Servlet -->
                    Nome: <input type="text" name="nome" /><br />
                    E-mail: <input type="text" name="email" /><br />
                    Endereço: <input type="text" name="endereco" /><br />
                    Data Nascimento: <input type="text" name="dataNascimento" /><br />

                    <input type="submit" value="Gravar" />
                </form>
            </body>
</html>