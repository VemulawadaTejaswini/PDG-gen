import java.util.Scanner;

// A - Cookie Exchanges
// https://atcoder.jp/contests/agc014/tasks/agc014_a
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int C = Integer.parseInt(scanner.next());
        scanner.nextLine();

        if (A == B && B == C) {
            System.out.println("-1");
            return;
        }

        int count = 0;
        while (A % 2 == 0 && B % 2 == 0 && C % 2 == 0) {
            int hA = A / 2;
            int hB = B / 2;
            int hC = C / 2;

            A = hB + hC;
            B = hA + hC;
            C = hA + hB;
            count++;
        }

        System.out.println(count);
    }
}
