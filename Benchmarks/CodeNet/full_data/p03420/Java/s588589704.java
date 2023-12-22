import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int sum = 0;
        for(int i = k + 1; i <= n; i++) {
            sum += (n / i) * (i - k);
            sum += Math.max(n%i-k+1, 0);
        }
    }
}