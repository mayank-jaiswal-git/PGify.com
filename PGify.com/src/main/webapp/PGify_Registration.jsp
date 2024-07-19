<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Registration Page</title>
    <link rel="stylesheet" href="PGify_css/Registration_PGify.css" />
  </head>
  <body>
    <div class="div-login">
       <div class="left-div">
        <div class="div-logo">
            <img src="PGify_Images/Copy of PGify.com_20240504_212204_0000_page-0001.jpg" alt="">
        </div>
        <div class="content">
            <form action="user_register" onsubmit="return isValidate()" method="post">
                <div class="User-Details">
                    <div class="input-Box">
                        <span class="details">Full Name</span>
                        <input class="first-name" id="name" type="text" placeholder=" Enter your Name" name="fullname" required>
                        <span id="name_error" class="name_er name_hide">***Enter a Valid Name...</span>
                    </div>
                    
                    <div class="input-Box">
                        <span class="details">User Name</span>
                        <input type="text" id="username" placeholder=" Enter your Username" name="username" required>
                        <span id="username_error" class="username_er username_hide">***Enter a Valid User Name...</span>
                    </div>

                    <div class="input-Box">
                        <span class="details">Email</span>
                        <input type="email" id="email" placeholder=" Enter your Email" name="email" required>
                        <span id="email_error" class="email_er email_hide">***Enter a Valid Email...</span>
                    </div>

                    <div class="input-Box">
                        <span class="details">Phone Number</span>
                        <input type="number" id="phno" placeholder=" Enter your Phone Number" name="phonenumber" required>
                        <span id="phno_error" class="phno_er phno_hide">***Enter a Valid Phone Number...</span>
                    </div>

                    <div class="input-Box">
                        <span class="details">Password</span>
                        <input type="password" id="pswd" placeholder=" Enter your Password" name="password" required>
                        <span id="pswd_error" class="pswd_er pswd_hide">***Password Must Be Strong...</span>
                    </div>

                    <div class="input-Box">
                        <span class="details">Confirm Password</span>
                        <input type="password" id="conpswd" placeholder=" Confirm Your Password" name="conpassword" required>
                        <span id="conpswd_error" class="conpswd_er conpswd_hide">***Password is not Match...</span>
                    </div>
                </div>

                <div class="gender-details">
                    <span class="gender-title">Gender</span>
                    <div class="category">
                    <input type="radio" name="gender" id="dot-1" value="Male" >
                    <label for="dot-1">Male</label>
                    <input type="radio" name="gender" id="dot-2" value="Female" >
                    <label for="dot-2">Female</label>
                    <input type="radio" name="gender" id="dot-3" value="Prefer not to say" >
                    <label for="dot-3">Prefer not to say</label>
                    </div>
                    <span id="gender_error" class="gender_er gender_hide">***Choose a Valid Gender...</span>
                </div>
                
                <div class="button">
                    <input type="submit" value="Register">
                </div>
                
            </form>
        </div>

       </div>
       <div class="right-div">
        <div class="heading"><p>Registration Form</p></div>
         <div class="image-div">
            <img src="PGify_Images/register_1.2_inc.png" alt="">
          </div>
       </div>
    </div>
    <script src="PGify_JS/Registration.js"></script>
  </body>
</html>
    