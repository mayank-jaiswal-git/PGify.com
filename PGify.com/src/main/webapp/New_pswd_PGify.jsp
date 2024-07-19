<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <link rel="stylesheet" href="PGify_css/New_pswd_PGify.css">
</head>
<body>
<div class="main">     
   <div class="input-div">
       <div class="Details-here">
          <!-- <img src="../IMAGES/Copy of PGify.com_20240504_212204_0000_page-0001.jpg" alt=""> -->
           <span>Enter the Password</span>
       </div>
    <form class="input" action="New_pswd" onsubmit="return isValidate()" method ="post">
       <div class="content">
        <img class="pswd_img" src="PGify_Images/lock (1).png" alt="">
        <div class="input_box">
        <input id="pswd_input" class="new_pswd" type="password" name="new_pswd" placeholder="Enter the New Password..." required>
        <span id="new_pswd_error" class="pswd_er pswd_hide">***Password Must Be Strong...</span>
         </div>
         <img class="re_pswd_img" src="PGify_Images/password-setting (1).png" alt="">
         <div class="input_box">
        <input id="re_pswd_input" class="re_new_pswd" type="password" name="re_pswd" placeholder="Re-enter the Password ..."  required>
        <span id="re_pswd_error" class="re_pswd_er re_pswd_hide">***Password is not Match...</span>
         </div>
        </div>
        <button class="pswd-button" type="submit">Reset Password</button>
    </form>
    </div>
  <div class="div-img">
    <img src="PGify_Images/Pgify.com(5.1).jpg" alt="">
  </div>
</div>  
</body>
<script src="PGify_JS/New_pswd_PGify.js"></script>
</html>