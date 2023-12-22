import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 1;
        int first = sc.nextInt();
        if (first != 0) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i < N; i++) {
            ans *= sc.nextInt();
            ans %= 998244353;
        }
        System.out.println(ans);
    }
}
