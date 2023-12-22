import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                for (int k = 1; k < n + 1; k++) {
                    int a = gcd(j, k);
                    int b = gcd(i, a);
                    sum += b;
                }
            }
        }
        System.out.println(sum);

    }
}
