import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 158
 * D - String Formation
 * https://atcoder.jp/contests/abc158/tasks/abc158_c
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayDeque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            deque.addLast(s.substring(i, i + 1));
        }
        int q = sc.nextInt();
        boolean isAsc = true;
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (t == 1) {
                isAsc = !isAsc;
            } else {
                int f = sc.nextInt();
                if (f == 1) {
                    if (isAsc) {
                        deque.addFirst(sc.next());
                    } else {
                        deque.addLast(sc.next());
                    }
                } else {
                    if (isAsc) {
                        deque.addLast(sc.next());
                    } else {
                        deque.addFirst(sc.next());
                    }
                }
            }
        }
        int size = deque.size();
        if (isAsc) {
            for (int i = 0; i < size; i++) {
                System.out.print(deque.pollFirst());
            }
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(deque.pollLast());
            }
        }

    }
}
