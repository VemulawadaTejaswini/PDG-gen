import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        for (int i = 0; i < n; i++) {
            if (a[i] * 4 * m >= sum) {
                ++ans;
            }
        }
        if (ans >= m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
