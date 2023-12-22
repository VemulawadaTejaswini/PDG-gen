import java.util.Scanner;

/**
 * TITLE : String Formation
 * URL : https://atcoder.jp/contests/abc158/tasks/abc158_d
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();

        StringBuilder answer = new StringBuilder(S);
        for (int i = 0; i < Q; i++) {
            int T = sc.nextInt();
            if (T == 1) {
                char start = answer.charAt(0);
                char end = answer.charAt(answer.length() - 1);
                answer.setCharAt(0, end);
                answer.setCharAt(answer.length() - 1, start);
            }
            else {
                int F = sc.nextInt();
                String C = sc.next();
                if (F == 1) {
                    answer.insert(0, C);
                }
                else {
                    answer.append(C);
                }
            }
        }
        System.out.println(answer.toString());
        sc.close();
    }
}