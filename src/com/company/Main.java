package com.company;

import java.util.Arrays;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
         Multiply multiply = new Multiply();
        System.out.println(multiply.multiply(Double.MAX_VALUE, (Double) 2.0));
        //a1 = ["tarp", "mice", "bull"]
        //
        //a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

        String a[] = new String[]{"rong", "tarp", "arp",  "arpa"};
        String b[] = new String[]{"lively", "alive", "harp", "sharpa", "armstrong"};
        System.out.println(Arrays.toString(WhichAreIn.inArray(a, b)));

        System.out.println(Troll.disemvowel("Why isn't the method toLowerCase(); working in my code?"));

        System.out.println(Accumul.accum("RqaEzty"));

        //for(Map.Entry)
    }
}


