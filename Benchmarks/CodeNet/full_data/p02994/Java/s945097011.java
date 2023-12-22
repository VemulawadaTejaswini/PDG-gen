import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int l = input.nextInt();

        int sum = 0;
        int ex = 0;

        for (int i = 1; i <= n; i++) {
        	sum += i;
        }

        if (l - 1 >= 0) {
        	ex = 1;
        } else if (l - 1 <= n * (-1)) {
        	ex = n;
        } else {
        	ex = 1 - l;
        }

        sum -= ex;

        int ans = (n - 1) * (l - 1) + sum;

        System.out.println(ans);

    }
}
