<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script
      src="https://kit.fontawesome.com/64d58efce2.js"
      crossorigin="anonymous"
    ></script>
    <link rel="stylesheet" href="style.css" />
    <title>Sign in & Sign up Form</title>
  </head>
  <body>
    <div class="container">
    
      <div class="forms-container">
        <div class="signin-signup">
          <form action="Login" method="post" class="sign-in-form">
            <h2 class="title">Login</h2>
            <div class="input-field">
              <i class="fas fa-user"></i>
              <input class="form-control" type="email" name="email" placeholder="Email" required>
             
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
              <input class="form-control" type="password" name="password" placeholder="Password" required>
              
            </div>
            <input type="submit" value="Login" class="btn solid" />
            <p class="social-text">Or Sign in with social platforms</p>
            <div class="social-media">
              <a href="#" class="social-icon">
                <i class="fab fa-facebook-f"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-twitter"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-google"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-linkedin-in"></i>
              </a>
            </div>
          </form>
          <!-- <form action="registerServlet" method="post" class="sign-up-form" id="form"> -->
          <form action="registerServlet" onsubmit="return validateInputs()" method="post" class="sign-up-form" name="myform" >
            <h2 class="title">Registration Form</h2>
            <div class="input-field">
              <i class="fas fa-user"></i>

              <input type="text" name="name" id="rname" placeholder="Name" required>
              <div class="error"></div>
            </div>
            <div class="input-field">
              <i class="fas fa-envelope"></i>
              
              <input type="email" name="email" id="remail" placeholder="Email ID" required>
              <div class="error"></div>
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
             
              <input type="password" name="password" id="rpassword" placeholder="Password" required>
              <div class="error"></div>
            </div>
           
            <input type="submit" class="btn" value="Register" />
            <p class="social-text">Or Sign up with social platforms</p>
            <div class="social-media">
              <a href="#" class="social-icon">
                <i class="fab fa-facebook-f"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-twitter"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-google"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-linkedin-in"></i>
              </a>
            </div>
          </form>
        </div>
      </div>

      <div class="panels-container">
        <div class="panel left-panel">
          <div class="content">
            <h3>New Here ?</h3>
            <p>
             let's start to create 
               Automatic Timetable Generator
            </p>
            <button class="btn transparent" id="sign-up-btn">
              Register
            </button>
          </div>
          <img src="img/now4.jpg" class="image" alt="not shown" />
        </div>
        <div class="panel right-panel">
          <div class="content">
            <h3>One of us ?</h3>
            <p>
              Do login to use the features of 
              timetable generator
            </p>
            <button class="btn transparent" id="sign-in-btn">
              Login
            </button>
          </div>
       
          <img src="img/register.svg" class="image" alt="not shown" />
        </div>
      </div>
    </div>

     <script language="javascript" type="text/javascript" defer src="app.js"></script>
  
   
    
  </body>
</html>
