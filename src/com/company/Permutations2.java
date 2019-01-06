package com.company;

/*In this kata you have to create all permutations of an input string and remove duplicates, if present. This means, you have to shuffle all letters from the input in all possible orders.

        Examples:

        Permutations.singlePermutations("a") `shouldBe` ["a"]
        Permutations.singlePermutations("ab") `shouldBe` ["ab", "ba"]
        Permutations.singlePermutations("aabb") `shouldBe` ["aabb","abab","abba","baab","baba","bbaa"]*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations2 {
    //static HashSet<String> permutations = new HashSet<>();
    int numberPermutations;

    static int getNumberPermutations(String s) {
        return singlePermutations(s).size();
    }

    public static List<String> singlePermutations(String s) {
        HashSet<String> permutations = new HashSet<>();
        HashSet<String> permutations2 = new HashSet<>();
        int n = s.length();
        while (n > 0) {
            if (permutations.size() > 0) {
                //int i = 0;
                permutations.addAll(permutations2);
                for (String el : permutations) {
                    for (int i = 0; i < s.length(); i++) {
                        StringBuilder stringBuilder = new StringBuilder(el);
                        stringBuilder.insert(0, stringBuilder.charAt(i));
                        stringBuilder.deleteCharAt(i + 1);
                        permutations2.add(stringBuilder.toString());
                    }
                    //i++;
                }
                n--;
            } else {
                for (int i = 0; i < s.length(); i++) {
                    StringBuilder stringBuilder = new StringBuilder(s);
                    stringBuilder.insert(0, stringBuilder.charAt(i));
                    stringBuilder.deleteCharAt(i + 1);
                    permutations.add(stringBuilder.toString());
                }
            }
        }
        return new ArrayList<>(permutations);
    }


    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        String input = "jhhnuoo";
        System.out.println(singlePermutations(input));
        System.out.println(getNumberPermutations(input));

        String text = singlePermutations(input).toString(); // строка для записи
        try (FileOutputStream fos = new FileOutputStream("notes.txt")) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}
