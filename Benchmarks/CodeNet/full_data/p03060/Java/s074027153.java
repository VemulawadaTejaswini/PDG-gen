import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        final int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        final int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += v[i] - c[i] > 0 ? v[i] - c[i] : 0;
        }

        System.out.println(ans);
    }
}
