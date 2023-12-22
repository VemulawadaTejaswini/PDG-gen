import java.util.Scanner;

/**
 * TITLE : Digits
 * URL : https://atcoder.jp/contests/abc156/tasks/abc156_b
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(Integer.toString(N, K).length());
        sc.close();
    }
}