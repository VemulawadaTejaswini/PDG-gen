import java.util.Scanner;

// D - Brick Break
// https://atcoder.jp/contests/abc148/tasks/abc148_d
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        int breakCount = 0;
        int kIndex = 1;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(scanner.next());

            if (kIndex != num) {
                breakCount++;
            } else {
                kIndex++;
            }
        }
        scanner.close();

        if (breakCount == N) {
            System.out.println("-1");
        } else {
            System.out.println(breakCount);
        }
    }
}
