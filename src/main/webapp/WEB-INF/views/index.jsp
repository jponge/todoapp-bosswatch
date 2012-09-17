<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="refresh" content="5">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
    <style type="text/css">
      body {
        margin-top: 60px;
      }
    </style>
    <title>Spy on your employees</title>
  </head>
  <body>
    <div class="container">
      <p><i class="icon-eye-open"></i> Spy on your employees</p>
      <table class="table table-hover table-bordered">
        <% for (String todo : (List<String>) request.getAttribute("completed")) {%>
        <tr>
          <td><%= todo%></td>
        </tr>
        <% }%>
      </table>        
    </ul>
  </div>    
</body>
</html>
