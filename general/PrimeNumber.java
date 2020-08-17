package general;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    
    public static boolean isPrime(int number) {
        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else if (number == 2) {
            isPrime = true;
        } else {
            int upperLimit = (int) Math.sqrt(number) + 1;
            for (int i = 2; i < upperLimit; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int max = 1000;
        List<Integer> primeContainer = new ArrayList<Integer>();

        for (int i = 0; i <= max; i++ ) {
            String isPrime = isPrime(i) ? "prime" : "not prime";
            if (isPrime(i)) {
                isPrime = "prime";
                primeContainer.add(i);
            } else {
                isPrime = "not prime";
            }
            System.out.println(i + " is " +  isPrime);
        }
        System.out.print("Prime numbers from 0 to " + max + " are " + primeContainer.toString());
        System.out.println("Total primes from 0 to " + max + " is " + primeContainer.size());
    }
}