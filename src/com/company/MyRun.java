package com.company;

import java.util.Arrays;

public class
MyRun
{
    public static void
    main(String [] args)
    {
        String [][] argCopy =
                new
                        String[2][2];
        int
                x;
        argCopy[0] = args;

        System.out.println(Arrays.deepToString(argCopy));
        x = argCopy[0].length;
        for
        (
                int
                y = 0; y < x; y++)
        {
            System.out.println(" " + argCopy[0][y]);
        }

        int x2 = 10;
        for
        ( int y=0; y<5; y++, x2--
        )
            System.out.print(x2 + ", ");
    }
}
