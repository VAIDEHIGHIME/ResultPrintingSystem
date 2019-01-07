<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Dashboard</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="img/IIITNLogo.png" rel="icon"><!--iiitn logo-->
    <link href="img/IIITNLogo.png" rel="apple-touch-icon">
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.css"></script>
    <link rel="stylesheet" href="css/Year.css">
	<script>
	$(document).ready(
	function() 
	{
		$("#year").change(
		function()
		{
			var el = $(this) ;
			if(el.val() === "2016" )
			{
				$("#semester").append("<option>3</option>");
				$("#semester").append("<option>4</option>");
			}
			else if(el.val() === "2017" )
			{
				$("#semester option:last-child").remove() ;
				$("#semester option:last-child").remove() ;
				
			}
		});

	});
        function validate() 
        {
            var x = document.forms["Form"]["ID"].value;
            if (x == "")
            {
                alert("Enrollment ID must be filled out");
                return false;
            }
        }
	</script>
  </head>
  <body>
      <%
          response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
          response.setHeader("Pragma","no-cache");
          response.setHeader("Expires","0");
          
          if(session.getAttribute("email")==null)
          {
              response.sendRedirect("Login.jsp");
          }
          
      %>
     
      <div class="container-fluid">
        <div class="jumbotron">
            <img src="img/IIITNLogo.png" alt="" width="100" height="100">
            <h1>Indian Institute of Information Technology,Nagpur</h1>      
        </div>
        <div> 
            <button type="button" class="btn btn-primary btn-lg btn-block" style="float:left;width: 50%">You are logged in as<u> <b>${email}</b></u></button>           
            <a href="LogoutController" class="btn btn-info btn-lg" style="float:right; width: 50%" >
              <span class="glyphicon glyphicon-log-out"></span> Log out
            </a>
        </div>     
        <div class="col-md-4 col-sm-4 col-xs-12"></div>
        <div class="col-md-4 col-sm-4 col-xs-12" style="margin-top:5vh;">
          <form class="form-container"  name="Form"  action="DisplayController" onsubmit="return validate();" method="post" >
              <div class="form-group">
                    <label for="exampleInputEmail1">Department</label>
                    <select id="dpt" name="dpt">
                            <option>CSE</option>
                            <option>ECE</option>
                    </select>
                    <br>
                    <label for="exampleInputEmail1">Enrollment Year</label>
                    <select id="year" name="year">
                            <option>2017</option>
                            <option>2016</option>
                    </select>
                    <br>
                    <label for="exampleInputEmail1">Semester:</label>
                    <select id="semester" name="semester">
                            <option>1</option>
                            <option>2</option>
                    </select>
                    <br>
                    <label for="exampleInputEmail1">Enrollment ID:</label>
                    <div class="col-sm-10">
                    <input type="text" class="form-control" id="ID"  name="ID">
                    </div>
              </div>
              <br>
              <br>
              <input type="submit" value="Submit" class="btn btn-success btn-block">
        </form>
        </div>
        <div class="col-md-4 col-sm-4 col-xs-12"></div>
      </div>
  </body>
</html>