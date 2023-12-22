import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long n = scn.nextLong();
        long ans = 1000 * (n / 500);
        n %= 500;
        ans += 5 * (n / 5);
        System.out.println(ans);

    }
}