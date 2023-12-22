import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next());
        }
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            int sub = x[i + 1] - x[i];
            ans += Math.min(b, sub * a);
        }
        System.out.println(ans);
    }
}