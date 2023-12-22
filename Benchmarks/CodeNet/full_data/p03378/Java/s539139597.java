import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), x = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < m; i++) {
            a[in.nextInt()] = 1;
        }
        int ans = 0;
        for (int i = x; i < n; i++) {
            ans += a[i];
        }
        System.out.println(ans);
    }
}
