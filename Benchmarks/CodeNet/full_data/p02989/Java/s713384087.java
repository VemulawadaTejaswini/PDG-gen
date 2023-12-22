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

        int arc = d[n / 2];
        int abc = d[n / 2 - 1];
        return arc - abc;
    }
}
