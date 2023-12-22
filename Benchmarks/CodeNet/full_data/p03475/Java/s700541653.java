import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        int[] s = new int[n];
        int[] f = new int[n];
        for (int i = 0; i < n - 1; i++) {
            c[i] = sc.nextInt();
            s[i] = sc.nextInt();
            f[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        for (int i = 0; i < n - 1; i++) {
            ans[i] = c[i] + s[i];
            for (int j = i + 1; j < n - 1; j++) {
                int startTime = s[j];
                if (ans[i] > startTime) {
                    while (ans[i] > startTime) {
                        startTime += f[j];
                    }
                }
                ans[i] = c[j] + startTime;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }

}
