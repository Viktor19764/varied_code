package com.company;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.log;
import static java.lang.Math.sqrt;


//The Fibonacci numbers are the numbers in the following integer sequence (Fn):
//
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
//
//        such as
//
//        F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.
//
//        Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying
//
//        F(n) * F(n+1) = prod.
//
//        Your function productFib takes an integer (prod) and returns an array:
//
//        [F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
//
//        depending on the language if F(n) * F(n+1) = prod.
//
//        If you don't find two consecutive F(m) verifying F(m) * F(m+1) = prodyou will return
//
//        [F(m), F(m+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
//
//        F(m) being the smallest one such as F(m) * F(m+1) > prod.
//Notes: Not useful here but we can tell how to choose the number n up to which to go: we can use the "golden ratio" phi which is (1 + sqrt(5))/2 knowing that F(n) is asymptotic to: phi^n / sqrt(5). That gives a possible upper bound to n.

public class ProdFib<x> {

    static long numberInFibonacciArray(long x) {
        return (long) (log(2 * sqrt(5) * x) / log((1 + sqrt(5)) / 2) - 1);
    }

    static ArrayList<Long> middleOfArray(long x) {
        ArrayList<Long> list = new ArrayList<>();
        list.add(0l);
        list.add(1l);
        list.add(1l);
        for (int i = 3; i <= x / 2 + 2; i++) {
            list.add(list.get(i - 2) + list.get(i - 1));
        }
        System.out.println(list);
        return list;
    }

    public static long[] productFib(long prod) {
        long n = numberInFibonacciArray(prod);
        ArrayList<Long> list = middleOfArray(n);
        double a = (double) list.get(list.size() - 3) * list.get(list.size() - 2);
        double b = (double) list.get(list.size() - 2) * list.get(list.size() - 1);
        if (a == prod)
            return new long[]{list.get(list.size() - 3), list.get(list.size() - 2), 1};
        if (b == prod)
            return new long[]{list.get(list.size() - 2), list.get(list.size() - 1), 1};
        if (a < prod && b > prod)
            return new long[]{list.get(list.size() - 2), list.get(list.size() - 1), 0};
        return new long[]{-1};
    }

    public static void main(String[] args) {
        long x = Long.MAX_VALUE;

        System.out.println(numberInFibonacciArray(x));
        ArrayList<Long> list = middleOfArray(numberInFibonacciArray(x));

        double a = list.get(list.size() - 3) * list.get(list.size() - 2);
        double b = (double) list.get(list.size() - 2) * list.get(list.size() - 1);
//        BigDecimal aa = new BigDecimal(list.get(list.size() - 3)).multiply(new BigDecimal(list.get(list.size() - 2)));
//        BigDecimal bb = new BigDecimal(list.get(list.size() - 2)).multiply(new BigDecimal(list.get(list.size() - 1)));
        double gb = 14284196614945309248d;

        System.out.println(a);
        System.out.println(b);
//        System.out.println(aa);
//        System.out.println(bb);
        System.out.println(Arrays.toString(productFib(x)));


    }

}
