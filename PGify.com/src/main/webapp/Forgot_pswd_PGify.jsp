<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <link rel="stylesheet" href="PGify_css/Forgot_pswd_PGify.css">
</head>
<body>
<div class="main">     
   <div class="input-div">
       <div class="Details-here">
          <!-- <img src="../IMAGES/Copy of PGify.com_20240504_212204_0000_page-0001.jpg" alt=""> -->
           <span>Enter the Details</span>
       </div>
    <form class="input" action="forgot_pswd"  method="post">
     
        <img class="gmail_img" src="PGify_Images/email.png" alt="">
        <input id="Gmail_input" class="gmail"type="email" name="gmail" placeholder="Enter the Gmail Here..." required>
         <img class="contact_img" src="PGify_Images/phone.png" alt="">
        <input id="Phno_input" class="phno" type="number" name="phone_number" placeholder="Enter the Contact Number..."  required>
        <button class="Verify-button">Verify Details</button>
    </form>
    </div>
  <div class="div-img">
    <img src="PGify_Images/Pgify.com(5.1).jpg" alt="">
  </div>
</div>  
</body>
</html>