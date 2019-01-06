package com.company;


/*When you divide the successive powers of 10 by 13 you get the following remainders of the integer divisions:

        1, 10, 9, 12, 3, 4.

        Then the whole pattern repeats.

        Hence the following method: Multiply the right most digit of the number with the left most number in the sequence shown above, the second right most digit to the second left most digit of the number in the sequence. The cycle goes on and you sum all these products. Repeat this process until the sequence of sums is stationary.

        ...........................................................................

        Example: What is the remainder when 1234567 is divided by 13?

        7×1 + 6×10 + 5×9 + 4×12 + 3×3 + 2×4 + 1×1 = 178

        We repeat the process with 178:

        8x1 + 7x10 + 1x9 = 87

        and again with 87:

        7x1 + 8x10 = 87

        ...........................................................................

        From now on the sequence is stationary and the remainder of 1234567 by 13 is the same as the remainder of 87 by 13: 9

        Call thirt the function which processes this sequence of operations on an integer n (>=0). thirt will return the stationary number.

        thirt(1234567) calculates 178, then 87, then 87 and returns 87.

        thirt(321) calculates 48, 48 and returns 48*/

public class Thirteen {

    public static long thirt(long n) {
        long tempStacionarNumber = n;
        while (tempStacionarNumber != tempThirt(tempStacionarNumber)) {
            tempStacionarNumber = tempThirt(tempStacionarNumber);
        }
        return tempStacionarNumber;
    }

    public static long tempThirt(long n) {
        long tempNumber = 0;
        long[] remaindersArray = {1, 10, 9, 12, 3, 4};
        int numberOfDigits = 1;
        for (long i = n; i >= 10; i = i / 10) {
            numberOfDigits++;
        }
        long[] inputNamberArray = new long[numberOfDigits];
        for (int i = 0; i < numberOfDigits; i++) {
            inputNamberArray[i] = n % (int) Math.pow(10, numberOfDigits - i) / (long) Math.pow(10, numberOfDigits - i - 1);
        }
        int j = 0;
        for (int i = inputNamberArray.length - 1; i >= 0; i--) {
            tempNumber += inputNamberArray[i] * remaindersArray[j];
            if (j < remaindersArray.length - 1)
                j++;
            else
                j = 0;
        }
        return tempNumber;
    }


    public static void main(String[] args) {
        System.out.println(thirt(1234567));
    }

   /* private static final int a[] = {1, 10, 9, 12, 3, 4};
    public static long thirt(long n) {
        // New number
        long r = 0;
        //Converting long to String
        String s = new String("" + n);
        for (int i = s.length()-1; i >=0 ; --i)
            r += (s.charAt(i) - '0') * a[(s.length() - i - 1) % 6];
        if (r == n)
            return r;
        return thirt(r);
    }*/
}
