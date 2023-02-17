const sign_in_btn = document.querySelector("#sign-in-btn");
const sign_up_btn = document.querySelector("#sign-up-btn");
const container = document.querySelector(".container");

sign_up_btn.addEventListener("click", () => {
  container.classList.add("sign-up-mode");
});

sign_in_btn.addEventListener("click", () => {
  container.classList.remove("sign-up-mode");
});



function validateInputs()
{
    flag=false;
    var usernameValue = document.forms["myform"]["name"].value;
    var emailValue = document.forms["myform"]["email"].value;
    var passwordValue = document.forms["myform"]["password"].value;
    
         if(usernameValue == '') {
             alert("Username is required");
                flag=false;
         } else {
        flag=true
         }
        
         if (!isValidEmail(emailValue)) {
            alert("Please provide correct email");
           flag=false;
        } else {
            flag=true;
        }
      if (passwordValue.length < 8 ) {
            alert("Password must be at least 8 character");
           flag=false;
        } else {
           flag=true;
        }
        return flag;
  
}

const isValidEmail = email => {
        const re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(String(email).toLowerCase());
    }