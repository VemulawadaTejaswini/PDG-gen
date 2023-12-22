import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();

        sc.close();

        long ans = Math.abs((n - 2) * (m - 2));

        System.out.println(ans);
    }
}