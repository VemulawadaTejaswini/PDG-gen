import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n + 1];
        int total = 0;
        for (int i = 1; i <= n; i++) {
            ar[i] = sc.nextInt();
            total += ar[i];
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(total - ar[p] + x);
        }
    }
}