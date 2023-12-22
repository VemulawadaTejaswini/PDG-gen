import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        n -= k*(n/k);
        System.out.println(Math.min(n, Math.abs(n-k)));
    }

}
