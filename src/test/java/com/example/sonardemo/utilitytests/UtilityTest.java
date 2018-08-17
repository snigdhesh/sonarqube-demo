package com.example.sonardemo.utilitytests;

import com.example.sonardemo.controllers.HelloController;
import com.example.sonardemo.utils.Utility;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UtilityTest {

    @Test
    public void whenEmptyString_thenAccept() {
        Utility UtilityTester = new Utility();
        String inputString="";
        assertTrue(UtilityTester.isPalindrome(""));
    }

    @Test
    public void whenPalindrome_thenAccept() {
        Utility UtilityTester = new Utility();
        assertTrue(UtilityTester.isPalindrome("noon"));
    }

    @Test
    public void whenNearPalindrome_thanReject(){
        Utility UtilityTester = new Utility();
        assertFalse(UtilityTester.isPalindrome("neon"));
    }

}
