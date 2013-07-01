<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <style type="text/css">
        * {
            padding: 0;
            margin: 0;
        }

        a {
            text-decoration: none;
            padding: 5px;
        }
    </style>
</head>
<body>
<h1>Spring 3 MVC REST web service</h1>

<h3>this is list page </h3>

<form action="" method="post" id="create" name="create">
    <button type="submit">submit create</button>
</form>
<form action="api/123456" method="put" id="update" name="update">
    <button type="submit">submit update</button>
</form>
<form action="api/123456" method="delete" id="delete" name="delete">
    <button type="submit">submit delete</button>
</form>
<form action="api/123456" method="get" id="get" name="get">
    <button type="submit">submit get one</button>
</form>

</body>
<script>

</script>
</html>