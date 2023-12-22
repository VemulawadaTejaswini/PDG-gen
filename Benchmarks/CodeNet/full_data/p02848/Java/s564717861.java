import java.util.Scanner;

// B - ROT N
// https://atcoder.jp/contests/abc146/tasks/abc146_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());
        char[] S = scanner.next().toCharArray();

        scanner.close();

        for (char c : S) {
            int tmp = c + N;
            if (tmp <= 90) {
                System.out.print((char) tmp);
            } else {
                System.out.print((char) (tmp % 90 + 64));
            }
        }
        System.out.println();
    }
}
