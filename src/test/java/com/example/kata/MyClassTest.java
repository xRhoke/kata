package com.example.kata;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class MyClassTest {

    @Test
    public void shouldAlwaysPass() {
        //Arrange
        int one = 1;

        //Act
        int result = new MyClass().returnOne(one);

        //Assert
        Assert.isTrue(result == 1, "How tf does one not equal one?");
    }
}
