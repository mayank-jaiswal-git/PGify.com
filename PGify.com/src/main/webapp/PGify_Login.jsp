<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login.com</title>
    <link rel="stylesheet" href="PGify_css/PGify_Login.css">
</head>
<body>
    <div class="div-login">
              <div class="div-img">
                <img src="PGify_Images/Pgify.com(5.1).jpg" alt="">
              </div>
       <div class="input-div">
             <div class="login-here">
               <span class="login_para">Login Here</span>
             </div>
               <form class="input" action="user_login"  method="post">
                <div class="input_field">
                <img id="login_user" class="user_img  user_img_hide" src="PGify_Images/user_login.png" alt="">
                <input id="name_input" class="name"type="text" name="uname" placeholder="Enter User Name..." required>
                <img id="login_pswd" class="pswd_img  pswd_img_hide" src="PGify_Images/lock.png" alt="">
                <input id="pswd_input" class="password" type="password" name="upassword" placeholder="Enter Your Password..."  required>
                </div>
                 <div class="forgot">
                         <%   
                            
                                if(session.getAttribute("error") != null)
                                {
                          %>
                  <span style="font-size: 1.1rem; color: red;">${error}</span>
                          <%
                                  session.removeAttribute("error");
                                }
                          %>
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
              <p class="create-btn"><a class="create_para"  href="PGify_Registration.jsp">Create Account</a></p>
             </div>
        </div>
    </div>  
</body>
</html>