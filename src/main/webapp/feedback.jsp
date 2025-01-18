<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="<%= application.getContextPath() %>/css/style.css" />
  </head>
  <body>
    <%@include file="header.jsp" %>
    <div class="container py-4 d-flex flex-column justify-content-center align-items-center">
    	<h3>Feedback form</h3>
    	<form action="<%=application.getContextPath()%>/feedback-submitted" method="post" class="mt-3">
  			<div class="mb-3">
    			<label for="exampleInputEmail1" class="form-label">Email address</label>
    			<input name="email" placeholder="abc@example.com" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  			</div>
  			<div class="mb-3">
    			<label for="exampleInputPassword1" class="form-label">Phone number</label>
    			<input name="phone" type="text" class="form-control" id="exampleInputPassword1">
  			</div>
  			<div class="mb-3 d-flex flex-column">
    			<label class="form-label">Feedback message</label>
    			<textarea name="feedback-message" rows="10" cols="50" placeholder="Enter feedback text..."></textarea>
  			</div>
  			<div class="container text-center">
  				<button type="submit" class="btn btn-primary">Submit</button>
  				<button type="reset" class="btn btn-light" >Reset</button>
  			</div>
		</form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="<%=application.getContextPath()%>/js/script.js"></script>
  </body>
</html>