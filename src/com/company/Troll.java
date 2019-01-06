package com.company;

public class Troll {
    public static String disemvowel(String str) {
        char[] arrayOfCharsOfInputString = str.toCharArray();
        char[] arrayOfVowels = {'A', 'O', 'U', 'E', 'I', 'a', 'o', 'u', 'e', 'i'};
        int count = arrayOfCharsOfInputString.length;
        for (char arrayOfVowelsEl : arrayOfVowels) {
            for (char arrayOfCharsOfInputStringEl : arrayOfCharsOfInputString) {
                if (arrayOfCharsOfInputStringEl == arrayOfVowelsEl) {
                    count--;
                }
            }
        }
        boolean flag;
        char[] resultChar = new char[count];
        count = 0;
        for (char arrayOfCharsOfInputStringEl : arrayOfCharsOfInputString) {
            flag = false;
            for (char arrayOfVowelsEl : arrayOfVowels) {
                if (arrayOfCharsOfInputStringEl == arrayOfVowelsEl) {
                    flag = true;

                }

            }
            if (!flag) {
                resultChar[count] = arrayOfCharsOfInputStringEl;
                count++;
            }
        }
        return String.valueOf(resultChar);
    }
}
