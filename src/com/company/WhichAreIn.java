package com.company;

import java.util.Arrays;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        String a1[] = array1;
        String b2[] = array2;

        int count = 0;
        for (String string : array1) {
            if (string != null) {
                for (String el : array2) {
                    if (el != null && el.contains(string)) {
                        count++;
                        break;
                    }
                }
            }
        }

        String[] resultArray = new String[count];
        count = 0;
        if (resultArray.length != 0) {
            for (String string : array1)
                if (string != null) {

                    {
                        for (String el : array2) {
                            if (el != null && el.contains(string)) {
                                resultArray[count] = string;
                                count++;
                                break;
                            }
                        }
                    }
                }
        }

        Arrays.sort(resultArray);

        return resultArray;


    }


}
