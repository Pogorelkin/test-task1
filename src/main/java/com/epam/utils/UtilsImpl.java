package com.epam.utils;

import com.epam.Exceptions.FactorialCalcException;
import com.epam.Exceptions.ConcatStringException;

public class UtilsImpl implements Utils {
    @Override
    public String concatenateWords(String string1, String string2) throws ConcatStringException {
        if (string1 == null || string2 == null) throw new ConcatStringException("One or more strings are NULL");
        return string1 + string2;

    }

    @Override
    public Integer computeFactorial(int number) throws FactorialCalcException {
        int result = 1;
        int i = 1;
        if (number < 0) throw new FactorialCalcException("Number can't be negative");

        while (i <= number) {
            result *= i;
            i++;
        }
        return result;
    }

}
