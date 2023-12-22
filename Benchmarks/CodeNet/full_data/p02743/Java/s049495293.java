import java.util.Scanner;

/**
 * TITLE : Sqrt Inequality
 * URL : https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_c
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        double d = (double)a;
        System.out.println(d);

        long as = (long)Math.sqrt(a);
        long bs = (long)Math.sqrt(b);
        long cs = (long)Math.sqrt(c);

        System.out.println((as + bs) < cs ? "Yes" : "No");
        sc.close();
    }
}