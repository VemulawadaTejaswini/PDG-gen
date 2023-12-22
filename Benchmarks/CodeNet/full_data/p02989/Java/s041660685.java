import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        int ans = solve(n, d);
        System.out.println(ans);
    }

    static int solve(int n, int[] d) {
        Arrays.sort(d);

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, d[i]);
        }

        int ans = 0;
        for (int i = 1; i < max; i++) {
            int arc = 0;
            int abc = 0;
            for (int j = 0; j < n; j++) {

                if (d[j] >= i) {
                    arc++;
                } else {
                    abc++;
                }

            }
            if (arc == abc) {
                ans++;
            }
        }
        return ans;
    }
}
