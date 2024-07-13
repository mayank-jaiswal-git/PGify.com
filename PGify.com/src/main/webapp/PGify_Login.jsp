<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login.com</title>
    <link rel="stylesheet" href="PGify_css/Login_PGify.css">
</head>
<body>
    <div class="div-login">
              <div class="div-img">
                <img src="PGify_Images/Pgify.com(5.1).jpg" alt="">
              </div>
       <div class="input-div">
             <div class="login-here">
                <img src="PGify_Images/Copy of PGify.com_20240504_212204_0000_page-0001.jpg" alt="">
             </div>
          <form class="input" action="user_login"  method="post">
                <img id="login_user" class="user_img  user_img_hide" src="PGify_Images/user_login.png" alt="">
            <!-- <span id="name_span1" class="span1 para1hide">Enter User Name...</span> -->
                <input id="name_input" class="name"type="text" name="uname" placeholder=" Enter User Name..." required>
              <img id="login_pswd" class="pswd_img  pswd_img_hide" src="PGify_Images/lock.png" alt="">
                <!-- <span id="pswd_span2" class="span2 para2hide">Enter Your Password...</span> -->
                 <div class="forgot">
                <input id="pswd_input" class="password" type="password" name="upassword" placeholder=" Enter Your Password..."  required>
                <span id="forgotPswd" class="forgot_pswd"><a href="Forgot_pswd_PGify.jsp" style="text-decoration: none; color: #5b0e2d;">Forgot Password?</a></span>
                </div>
                  <div class="div-check">
                     <input class="check" type="checkbox"required><p>Remember me </p>
                  </div>
                <button class="login-button">Login</button>
          </form>
            <div class="logos-div">
                <p class="logo-para1">__________Or__________</p>
                <P class="logo-para2">Login With</P>
                <div class="logos">
                   <div class="logo-2">
                       <img src="PGify_Images/facebook (4).png" alt="">
                   </div>
                   <div class="logo-3">
                      <img src="PGify_Images/google-plus.png" alt="">
                   </div>
                </div>
            </div>
             <div class="register-div">
               <p class="details">Don't have an account ?</p>
               <button id="create-btn"><a style="color: #faf4f6; text-decoration: none;" href="PGify_Registration.jsp">Create Account</a></button>
             </div>
        </div>
    </div>  
</body>
</html>