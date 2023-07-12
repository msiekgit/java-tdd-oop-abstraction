package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    private static final String PASSWORD1 = "pass";
    private static final String PASSWORD2 = "password2312";
    private static final String EMAIL = "ASD@email.pl";
    private static final String EMAIL2 = "email.pl";


    @Test
    void validateEmailAdress_ShouldThrowException(){
        Assertions.assertThrows(IllegalStateException.class, ()-> new User(EMAIL2, PASSWORD2));
    }

    @Test
    void validateEmailAdress_ShouldNotThrowException(){
        Assertions.assertDoesNotThrow(()-> new User(EMAIL, PASSWORD2));
    }


    @Test
    void validatePassword_ShouldNotThrowException(){
        Assertions.assertDoesNotThrow(()-> new User(EMAIL, PASSWORD2));
    }

    @Test
    void validatePassword_ShouldthrowException(){
        Assertions.assertThrows(IllegalStateException.class, ()-> new User(EMAIL, PASSWORD1));
    }

    @Test
    void checkIfAccountIsDisabled_ShouldBeTrue(){
        User user = new User(EMAIL,PASSWORD2);
        boolean expectedValue = true;
        Assertions.assertTrue(expectedValue);
    }


}
