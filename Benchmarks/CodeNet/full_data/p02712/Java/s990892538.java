
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = n * (n+1) / 2;
        long num3, num5, num15;
        num3 =  n / 3;
        num5 = n / 5;
        num15 = n / 15;
        long sub = 3*(num3+1)*num3/2 + 5 * (num5+1)*num5/2 - 15*(num15+1)*num15/2;
        ans -= sub;
        System.out.println(ans);
    }
}