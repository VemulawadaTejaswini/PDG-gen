import java.util.Scanner;

/**
 * TITLE : AC or WA
 * URL : https://atcoder.jp/contests/abc152/tasks/abc152_a
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N == M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}