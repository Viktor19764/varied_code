package examples;

import java.util.Arrays;


public class Eratosfen {
    static boolean[] primes;

    public Eratosfen(int n) {
        primes = new boolean[n + 1];
    }

    public void fillSieve() {
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Eratosfen eratosfen = new Eratosfen(88);
        eratosfen.fillSieve();
        for (int i = 2; i < 88; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}