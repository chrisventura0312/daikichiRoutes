<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Omikuji</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <div class="container vertical-center">
        <div class="header">
            <h1>Here's Your Omikuji</h1>
        </div>
        <div class="content">
            <div id="Omikuji">
                <p class="lead">In <c:out value="${number}"/>
                    years, you will live in <c:out value="${city}"/>
                    with <c:out value="${person}"/> as your roommate,
                    <c:out value="${hobby}"/> for a living. The next
                    time you see a <c:out value="${thing}"/>, you will
                    have good luck. Also, <c:out value="${nice}"/>.
                </p>
            </div>
        </div>
    </div>
</body>
</html>





