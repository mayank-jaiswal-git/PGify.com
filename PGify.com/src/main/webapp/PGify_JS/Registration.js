function isValidate(){
    let name = document.querySelector("#name").value;
    let username = document.querySelector("#username").value;
    let email = document.querySelector("#email").value;
    let phno = document.querySelector("#phno").value;
    let pswd = document.querySelector("#pswd").value;
    let conpswd = document.querySelector("#conpswd").value;
    let gender_1 = document.querySelector("#dot-1");
    let gender_2 = document.querySelector("#dot-2");
    let gender_3 = document.querySelector("#dot-3");


    let name_error = document.querySelector("#name_error");
    let username_error = document.querySelector("#username_error");
    let email_error = document.querySelector("#email_error");
    let phno_error = document.querySelector("#phno_error");
    let pswd_error = document.querySelector("#pswd_error");
    let conpswd_error = document.querySelector("#conpswd_error");


   
    let name_check = /^[A-Za-z .]{3,}$/;
   
    let username_check = /^[A-Za-z0-9 ._]{3,}$/;
   
    let pswd_check = /^(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z0-9!@#$%^&*_]{8,16}$/;
   
    let email_check = /^[A-Za-z0-9_.]{6,}@[a-z]{3,}[.]{1}[a-z.]{2,6}$/;
    
    let phno_check = /^[6-9]{1}[0-9]{9}$/;

    if(name_check.test(name)) {
        name_error.classList.add("name_hide");
    
    }
    else{
        name_error.classList.remove("name_hide");
        return false;
        
    }

    if(username_check.test(username)) {
        username_error.classList.add("username_hide");
    }
    else{
        username_error.classList.remove("username_hide");
        return false;
    }


    if(email_check.test(email)) {
        email_error.classList.add("email_hide");
    }
    else{
        email_error.classList.remove("email_hide");
        return false;
    }


    if(phno_check.test(phno)) {
        phno_error.classList.add("phno_hide");
    }
    else{
        phno_error.classList.remove("phno_hide");
        return false;
    }


    if(pswd_check.test(pswd)) {
        pswd_error.classList.add("pswd_hide");
    }
    else{
        pswd_error.classList.remove("pswd_hide");
        return false;
    }


    if(conpswd == pswd) {
        conpswd_error.classList.add("conpswd_hide");
    }
    else{
        conpswd_error.classList.remove("conpswd_hide");
        return false;
    }

    if(gender_1.checked  || gender_2.checked || gender_3.checked){
        gender_error.classList.add("gender_hide");
    }
    else{
        gender_error.classList.remove("gender_hide");
        return false;
    }
}