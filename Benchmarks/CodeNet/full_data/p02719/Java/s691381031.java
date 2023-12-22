import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans1 = n%k;
        long ans2 = Math.abs(ans1 - k);
        if (ans1 > ans2) System.out.println(ans2);
        else System.out.println(ans1);
    }
}