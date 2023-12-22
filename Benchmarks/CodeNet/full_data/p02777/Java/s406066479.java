import java.util.Scanner;

// A - Remaining Balls
// https://atcoder.jp/contests/abc154/tasks/abc154_a
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        String U = scanner.next();
        scanner.close();

        if (S.contains(U)) {
            A--;
        }
        if (T.contains(U)) {
            B--;
        }
        System.out.println(A + " " + B);
    }
}
