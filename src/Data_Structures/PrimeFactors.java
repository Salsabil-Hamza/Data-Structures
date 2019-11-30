package Data_Structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("the prime factors of which number?");
        int n = input.nextInt();
        System.out.println(n+" has the following as prime factors "+primeFactors(n));


    }

    private static List<Integer> primeFactors(int n) {


        List<Integer> list = new ArrayList<>();



        for (int i = 2; i <= n; i++) {
            if ( n%i==0 && isPrime(i)==true)
            {           list.add(i);
        }
                }
        return list;
}
    private static boolean isPrime( int j) {
        boolean flag=true;
        for (int i = 2; i <j ; i++) {
            if (j%i==0) {flag=false; break;}

        }
        return flag;
    }

    }
