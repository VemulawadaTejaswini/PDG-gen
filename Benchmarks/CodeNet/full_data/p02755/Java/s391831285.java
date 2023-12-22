import java.util.Scanner;

/**
 * Tax Increase
 * 
 * https://atcoder.jp/contests/abc158/tasks/abc158_c
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int A = sc.nextInt();
        int B = sc.nextInt();

        int a = (int) Math.ceil(A / 0.08);
        int b = (int) Math.ceil(B / 0.1);

        int c = Math.max(a, b);

        if (Math.floor(c * 0.08) == A && Math.floor(c * 0.1) == B) {
            System.out.println(c);
        } else {
            System.out.println(-1);
        }
    }

}
