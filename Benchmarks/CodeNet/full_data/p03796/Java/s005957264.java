import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(prod(n));
    }

    static long prod(int n) {
        long total = 1;
        for (int i = 1; i <= n; i++) {
            total = (total * i) % 1000000007;
        }
        return total;
    }
}
