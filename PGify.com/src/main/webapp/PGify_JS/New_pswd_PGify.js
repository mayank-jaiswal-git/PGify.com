function isValidate(){
let new_pswd = document.querySelector("#pswd_input").value;

let re_pswd = document.querySelector("#re_pswd_input").value;

let pswd_error = document.querySelector("#new_pswd_error");
let re_pswd_error = document.querySelector("#re_pswd_error");

let pswd_check = /^(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z0-9!@#$%^&*_]{8,16}$/;

if(pswd_check.test(new_pswd)) {
    pswd_error.classList.add("pswd_hide");
}
else{
    pswd_error.classList.remove("pswd_hide");
    return false;
}
if(re_pswd == new_pswd) {
    re_pswd_error.classList.add("re_pswd_hide");
}
else{
    re_pswd_error.classList.remove("re_pswd_hide");
    return false;
}
}