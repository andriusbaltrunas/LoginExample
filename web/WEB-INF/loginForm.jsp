<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          crossorigin="anonymous">

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-6 mx-auto mt-auto">
            <c:if test="${not empty errorMsg}">
                <div class="alert alert-danger" role="alert">
                    <strong>${errorMsg}</strong>
                </div>
            </c:if>
            <form action="/Login" method="post">
                <div class="form-group">
                    <label for="exampleInputEmail1">User name</label>
                    <input type="text" name="userName" class="form-control" id="exampleInputEmail1"
                           aria-describedby="emailHelp" placeholder="User name">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" name="password" class="form-control" id="exampleInputPassword1"
                           placeholder="Password">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>
<%--js bibliotekos turi buti failo apacioje--%>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" crossorigin="anonymous"></script>
</body>
</html>