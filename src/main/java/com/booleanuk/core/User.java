package com.booleanuk.core;

public class User {
    private String emailAdress;
    private String password;
    private boolean disabled;

    public User(String emailAdress, String password) {
        validatePassword(password);
        validateEmailAdress(emailAdress);
        this.emailAdress = emailAdress;
        this.password = password;
        this.disabled = true;
    }

    private void validatePassword(String password){
        if (password.length() < 8)
            throw new IllegalStateException("Password should have at least 8 characters");
    }

    private void validateEmailAdress(String emailAdress){
        if (!emailAdress.contains("@"))
            throw new IllegalStateException("Invalid email adress");
    }

    private void activateAccount(){
        this.disabled = false;
    }

    public boolean checkIfAccountIsDisabled(){
        return disabled;
    }

}
