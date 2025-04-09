package com.example.task1;

import java.util.logging.Logger;

public class MyBigNumber {
    private static final Logger logger = Logger.getLogger(MyBigNumber.class.getName());
    public static String sum(String stn1, String stn2){
        char[] number1 = reverseCharArray(stn1.toCharArray());
        char[] number2 = reverseCharArray(stn2.toCharArray());

        int lengthLargeNumber = number1.length >= number2.length ? number1.length : number2.length;

        String result = "";
        boolean isCarry = false;
        for (int i = 0; i < lengthLargeNumber; i++) {
            int nb1 =  i < number1.length ? Integer.parseInt(number1[i]+"") : 0;
            int nb2 = i < number2.length ? Integer.parseInt(number2[i]+"") : 0;
            int sum = isCarry ? nb1 + nb2 + 1 : nb1 + nb2;
            int digit = sum % 10;
            result = digit + result;

            isCarry = sum >= 10;
            logger.info("kết quả sau lần " + (i + 1) + ":" + result);
        }

        return result;
    }

    private static char[] reverseCharArray(char[] arr) {
        int left = 0;
        int right = arr.length - 1;


        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }
}
