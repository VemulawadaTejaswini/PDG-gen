import java.util.Scanner;

/**
 * TITLE : I miss you...
 * URL : https://atcoder.jp/contests/abc154/tasks/abc154_b
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(S.replaceAll("[a-z]", "x"));
        sc.close();
    }
}