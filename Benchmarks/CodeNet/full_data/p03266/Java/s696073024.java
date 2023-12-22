import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int t = N / K;
        int ans = t*t*t;

        if (K % 2 == 0) {
            t = (((2 * N) / K) + 1)/2;
            ans += t*t*t;
        }
        System.out.println(ans);

    }
}