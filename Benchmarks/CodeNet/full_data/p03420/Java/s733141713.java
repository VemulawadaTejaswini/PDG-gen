import java.util.Scanner;

public class Main {
    Main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;

        for (int i = k; i < n; i++)
            ans += n - i;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j >= k)
                    ans++;
            }
        }
        System.out.println(ans);

    }

    public static void main (String[] args) {
        new Main();
    }

}
