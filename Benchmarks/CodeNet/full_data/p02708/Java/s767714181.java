
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int mod = 1000000007;
        int result = 0;
        for (int k = i; k <= n + 1; k++){
            result +=(n + (n - k + 1)) * k / 2 - k * (k - 1) / 2 + 1;
        }
        System.out.println(result % mod);
    }
}
