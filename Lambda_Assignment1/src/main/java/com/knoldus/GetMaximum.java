package com.knoldus;

import java.util.*;

public class GetMaximum implements GetMaximum_Interface {
    @Override
    public int getMaximumOfTwoNumbers(int number1, int number2) {

        List<Integer> numList = Arrays.asList(number1, number2);
        Optional<Integer> getMaxNum = numList.stream().max((num1, num2) -> {

            int getMaximumNumberOfTwo = Integer.compare(num1, num2);
            return getMaximumNumberOfTwo;
        });
        return getMaxNum.get();
    }
}
