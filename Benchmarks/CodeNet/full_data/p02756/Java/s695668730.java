import java.util.Scanner;

/**
 * AtCoder Beginner Contest 158
 * D - String Formation
 * https://atcoder.jp/contests/abc158/tasks/abc158_c
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        sc.nextLine();
        int q = sc.nextInt();
        boolean reverse = false;
        for (int i = 0; i < q; i++) {
            sc.nextLine();
            int t = sc.nextInt();
            if (t == 1) {
                reverse = !reverse;
            } else {
                int f = sc.nextInt();
                if (f == 1) {
                    if (!reverse) {
                        sb.insert(0, sc.next());
                    } else {
                        sb.append(sc.next());
                    }
                } else {
                    if (!reverse) {
                        sb.append(sc.next());
                    } else {
                        sb.insert(0, sc.next());
                    }
                }
            }
        }
        if (!reverse) {
            System.out.println(sb.toString());
        } else {
            System.out.println(sb.reverse().toString());
        }
    }
}
