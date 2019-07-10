package com.epam.utils;


import com.epam.Exceptions.ConcatStringException;
import com.epam.Exceptions.FactorialCalcException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;


public class UtilsTest {

    Logger logger = LoggerFactory.getLogger(UtilsTest.class);
    Utils utils = new UtilsImpl();
    String testString1, testString2;
    Integer testNumber;



    @Before
    public void setUp() {
        testNumber = 5;
        testString1 = "Hello";
        testString2 = "World";
    }


    @Test
    public void testConcatenateWordsStringNotNULL() {
        try {
            String expected = utils.concatenateWords(testString1, testString2);
            Assert.assertNotNull(expected);
        } catch (ConcatStringException e) {
            logger.info(e.getMessage());
        }
    }

    @Test
    public void testConcatenateWordsStringNotEmpty() {
        try {
            String expected = utils.concatenateWords(testString1, testString2);
            Assert.assertFalse(expected.isEmpty());
        } catch (ConcatStringException e) {
            logger.info(e.getMessage());
        }
    }

    @Test
    public void testConcatenateWordsStringLatin() {
        try {
            String expected = utils.concatenateWords(testString1, testString2);
            Assert.assertTrue(expected.matches("\\w+"));
        } catch (ConcatStringException e) {

        }
    }

    @Test
    public  void testComputeFactorial_5FactorialIn_125Out(){
        int expected = 120;
        int actual;

        try {
            actual = utils.computeFactorial(testNumber);
            Assert.assertEquals(actual,expected);
        } catch (FactorialCalcException e) {
            logger.info(e.getMessage());
        }
    }

    @Ignore
    @Test(timeout = 1000)
    public  void testComputeFactorialOfRandomIntNumberWithTimeLimit(){
        Random random = new Random();
        Integer randomNumber = random.nextInt(50);
        int expected = 1;
        int actual;

        for (int i = 0; i < randomNumber; i++) {
            expected *= i;
        }
        try {
            actual = utils.computeFactorial(randomNumber);
            Assert.assertEquals(expected, actual);
        } catch (FactorialCalcException e) {
            logger.info(e.getMessage());
        }



    }

}
