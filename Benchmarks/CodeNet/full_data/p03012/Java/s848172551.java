import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        Arrays.sort(w);
        int ans = 100;
        for (int i = 0; i < n - 1; i++) {
            int temp = 0;
            for (int j = i + 1; j < n; j++) {
                temp += w[j];
            }
            int tAns = Math.abs(w[i] - temp);
            if (tAns < ans) {
                ans = tAns;
            }
        }
        System.out.println(ans);
    }
}
