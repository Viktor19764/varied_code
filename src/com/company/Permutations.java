package com.company;


/*In this kata you have to create all permutations of an input string and remove duplicates, if present. This means, you have to shuffle all letters from the input in all possible orders.

        Examples:

        Permutations.singlePermutations("a") `shouldBe` ["a"]
        Permutations.singlePermutations("ab") `shouldBe` ["ab", "ba"]
        Permutations.singlePermutations("aabb") `shouldBe` ["aabb","abab","abba","baab","baba","bbaa"]*/

import java.util.HashSet;
import java.util.List;

public class Permutations {
    HashSet<String> permutations = new HashSet<>();

    public static List<String> singlePermutations(String s) {


        return null;
    }

    public HashSet<String> recursivePermutation(StringBuilder s) {

        HashSet<String> permutations2 = new HashSet<>();
        int n = s.length();
        while (n > 0) {
            if (permutations.size() > 0) {
                int i = 0;
                permutations.addAll(permutations2);
                for (String el : permutations) {
                    StringBuilder stringBuilder = new StringBuilder(el);
                    stringBuilder.insert(0, stringBuilder.charAt(n - 1));
                    stringBuilder.deleteCharAt(n);
                    permutations2.add(stringBuilder.toString());
                    i++;
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
        HashSet<String> newSet = new HashSet<>();
        newSet.addAll(permutations);
        System.out.println(permutations);
        return permutations;
    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        System.out.println(permutations.recursivePermutation(new StringBuilder("ghjklki")));
    }


}