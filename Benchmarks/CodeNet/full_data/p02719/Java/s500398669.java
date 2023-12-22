import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long n = stdIn.nextLong();
        long k = stdIn.nextLong();

        long a = n % k;
        long b = Math.abs(n % k - k);

        if(a < b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}