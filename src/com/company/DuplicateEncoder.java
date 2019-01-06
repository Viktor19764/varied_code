package com.company;

//The goal of this exercise is to convert a string to a new string where each character in the new string is '(' if that character appears only once in the original string, or ')' if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
//
//        Examples:
//
//        "din" => "((("
//
//        "recede" => "()()()"
//
//        "Success" => ")())())"
//
//        "(( @" => "))(("
public class DuplicateEncoder {
    static String encode(String word) {
        boolean flag = false;
        word = word.toLowerCase();
        char[] stringToCharArray = word.toCharArray();
        StringBuilder resultString = new StringBuilder(stringToCharArray.length);
        for (int i = 0; i < stringToCharArray.length; i++) {
            flag = false;
            char temp = stringToCharArray[i];
            for (int j = 0; j < stringToCharArray.length; j++) {
                if (stringToCharArray[j] == temp && i != j) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                resultString.insert(i, ')');
            else
                resultString.insert(i, '(');


        }
        return resultString.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("))))())))"));
    }
}
