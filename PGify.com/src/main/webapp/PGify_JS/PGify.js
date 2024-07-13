let nav_logo = document.querySelector("#logo");

nav_logo.addEventListener("click",() => {
    console.log("logo clicked");
});

let option_1 = document.querySelector("#home");

option_1.addEventListener("click",() => {
    console.log("home clicked");
});

let option_2 = document.querySelector("#land-lord");

option_2.addEventListener("click",() =>{
    console.log("land-lord clicked");
});

let option_3 = document.querySelector("#about-us");

option_3.addEventListener("click",() =>{  
     console.log("about-us clicked");
  });

  let option_4 = document.querySelector("#contact-us");

  option_4.addEventListener("click",() =>{  
     console.log("contact-us clicked");
    });

let btn1 = document.querySelector("#btn1");

btn1.addEventListener("click",() =>{
    // /btn1.classList.add("btn1");
    console.log("btn1 clicked");
})
// const boxes=document.querySelectorAll(".BoxShow");

// const checkBoxes=()=>{
//     const triggerButtom=(window.innerHeight/4)*4;
//     boxes.forEach((BoxShow)=>{
//         const boxTop=BoxShow.getBoundingClientRect().top;
//         if (boxTop<triggerButtom)BoxShow.classList.add("show");
//         else BoxShow.classList.remove("show");
//     });
// };

// window.addEventListener("scroll",checkBoxes);
// checkBoxes();
let searchBox = document.querySelector("#searchBox");
let search_input_box=document.querySelector("#search_box");
let searchimg=document.querySelector("#search_img");
let search_para1 = document.querySelector("#search_para1");
let search_para2 = document.querySelector("#search_para2");


searchimg.classList.remove("search_hide");
search_para1.classList.remove("para1_hide");



searchBox.addEventListener("click",()=>{
    
    searchimg.classList.add("search_hide");
    search_para1.classList.add("para1_hide");
    search_para2.classList.remove("para2_hide");
});

search_input_box.addEventListener("keypress",()=>{
    search_para2.classList.add("para2_hide");
});