<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

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

<form action="<%=basePath%>api/" method="post" id="create" name="create">
    <button type="submit">submit create</button>
</form>
<form action="<%=basePath%>api/123456" method="post" id="update" name="update">
    <input type="hidden" name="_method" value="put"/>
    <button type="submit">submit update</button>
</form>
<form action="<%=basePath%>api/123456" method="post" id="delete" name="delete">
    <input type="hidden" name="_method" value="delete"/>
    <button type="submit">submit delete</button>
</form>
<form action="<%=basePath%>api/123456" method="get" id="get" name="get">
    <button type="submit">submit get one</button>
</form>

</body>
<script>

</script>
</html>