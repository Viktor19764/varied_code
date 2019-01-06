package com.company;

public class Accumul {

    public static String accum(String s) {
        char[] arrayOfCharsOfInputString = s.toCharArray();

        int count = 1;
        int length = 0;
        for (char c : arrayOfCharsOfInputString) {
            length += count + 1;
            count++;
        }
        length = length - 1;
        char[] arrayOfChars = new char[length];

        int sumIndex = 0;
        for (int i = 0; i <= arrayOfCharsOfInputString.length - 1; i++) {
            int j = 0;
            for (; j <= i; j++) {
                arrayOfChars[sumIndex] = arrayOfCharsOfInputString[i];
                sumIndex++;
            }
            if (sumIndex < arrayOfChars.length)
                arrayOfChars[sumIndex] = '-';
            sumIndex++;
        }
        count = 0;
        for (char arrayOfChar : arrayOfChars) {
            arrayOfChars[count] = Character.toLowerCase(arrayOfChars[count]);
            count++;
        }

        count = 0;
        for (char arrayOfChar : arrayOfChars) {
            if (count<arrayOfChars.length && arrayOfChars[count] == '-')
                arrayOfChars[count+1]=Character.toUpperCase(arrayOfChars[count+1]);
            count++;
        }
        arrayOfChars[0]=Character.toUpperCase(arrayOfChars[0]);
        return String.valueOf(arrayOfChars);
    }
}


//        accum("abcd") -> "A-Bb-Ccc-Dddd"
//        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//        accum("cwAt") -> "C-Ww-Aaa-Tttt"