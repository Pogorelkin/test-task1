package com.epam.utils;

import com.epam.Exceptions.FactorialCalcException;
import com.epam.Exceptions.ConcatStringException;

public interface Utils {

    String concatenateWords(String string1, String string2) throws ConcatStringException;
    Integer computeFactorial(int number) throws FactorialCalcException;

}
