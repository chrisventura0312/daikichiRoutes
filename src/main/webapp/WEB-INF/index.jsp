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
    <div class="container">
        <div class="header">
            <h1>Omikuji</h1>
        </div>
        <div class="form ">
            <form action="/postOmikuji" method="post">
                <div class="form-group">
                    <label for="number">Pick any number 5 to 25:</label> 
                    <input type="number" class="form-control" id="number" name="number" placeholder="Enter number" min="5" max="25">
                </div>
                <div class="form-group">
                    <label for="city">Enter the name of any city:</label>
                    <input type="text" class="form-control input-lg" id="city" name="city" placeholder="Enter city">
                </div>
                <div class="form-group">
                    <label for="person">Enter the name of any real person:</label>
                    <input type="text" class="form-control input-lg" id="person" name="person" placeholder="Enter person">
                </div>
                <div class="form-group">
                    <label for="hobby">Enter a professional endeavor or hobby:</label>
                    <input type="text" class="form-control input-lg" id="hobby" name="hobby" placeholder="Enter hobby">
                </div>
                <div class="form-group">
                    <label for="thing">Enter any type of living thing:</label>
                    <input type="text" class="form-control input-lg" id="thing" name="thing" placeholder="Enter thing">
                </div>
                <div class="form-group">
                    <label for="nice">Say something nice to someone:</label>
                    <textarea class="form-control" rows="5" id="nice" name="nice" placeholder="Enter nice thing :)"></textarea>
                </div>
                <div class="form-group">
                <button type="submit" class="btn btn-primary btn-md">Submit</button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>