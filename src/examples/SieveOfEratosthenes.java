package examples;

import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        scanner.close();
        int[] table = new int[n];
        int arraySize = table.length;
        int idx = 0;
        int num = 1;

        while (idx < arraySize) {
            table[idx] = num;
            idx++;
            num++;
        }

        //System.out.print(2+" ");
        //System.out.print(3+" ");
        //square root method will not work for 2,and 3 so hard code itSystem.out.print(3+" ");
        for (int i = 2; i < arraySize; i++) {
            boolean flag = true;
            if (i >3){
                for (int j = 2; j <= (int) Math.sqrt(i); ++j) {
                    if (i % j == 0) {
                        //If factor is found make flag false
                        flag = false;
                        //If factor present then break out of loop
                        break;
                    }
                }
            }
            //If flag ids true that means No factor is found hence it is Prime
            //Hence print the result
            if (flag)
                System.out.print(i + " ");
        }
    }
}