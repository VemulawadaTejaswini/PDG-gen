import java.util.Scanner;

/**
 * TITLE : Tax Increase
 * URL : https://atcoder.jp/contests/abc158/tasks/abc158_c
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for (int i = 1; i <= 10000; i++) {
            double a = i * 0.08;
            double b = i * 0.1;
            if ((int)a == A && (int)b == B) {
                System.out.println(i);
                sc.close();
                return;
            }
        }
        System.out.println(-1);
        sc.close();
    }
}
