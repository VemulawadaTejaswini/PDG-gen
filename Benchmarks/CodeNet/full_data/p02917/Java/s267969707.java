import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 1; i < n; i++) {
            b[i] = sc.nextInt();
        }
        b[0] = b[1];
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += Math.min(b[i], b[i + 1]);
        }
        ans += b[b.length - 1];
        System.out.println(ans);
    }
}