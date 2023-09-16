const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

signUpButton.addEventListener('click', () => {
    container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
    container.classList.remove("right-panel-active");
});


function signUp(){
    $.ajax({
        url: "/ajax/signUp",
        type: "POST",
        data: $("[name=sign_up_form]").serialize(),
        success: function (res) {
            console.log(res);
            signInButton.click();
        }
    })
}