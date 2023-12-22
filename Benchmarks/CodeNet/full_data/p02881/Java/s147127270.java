import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        //String n = sc.next();

        if(isPrime(n)){
            System.out.println(n-1);
            return;
        }


        long temp = n-1;
        for(long i =1;i*i<= n ;i++){
            if(n%i==0){
                long add = i + (n/i) -2;
                if(temp > add){
                    temp = add;
                }
            }
        }

        System.out.println(temp);



    }
    public static boolean isPrime(long x) {
        for (long i = 2; i*i <= x; i++) {
            if (x % i == 0) {
                //System.out.println(x + "is divisible by " + i);
                return false;
            }
        }
        return true;
    }

}