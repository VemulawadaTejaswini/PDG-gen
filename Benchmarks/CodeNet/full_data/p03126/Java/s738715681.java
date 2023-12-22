import java.util.Scanner;

// B - Foods Loved by Everyone
// https://atcoder.jp/contests/abc118/tasks/abc118_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());

        int[] A = new int[M];
        for (int i = 0; i < N; i++) {
            int count = Integer.parseInt(scanner.next());
            for (int j = 0; j < count; j++) {
                int index = Integer.parseInt(scanner.next()) - 1;
                A[index]++;
            }
        }
        scanner.close();

        int sum = 0;
        for (int a : A) {
            if (a == N) sum++;
        }

        System.out.println(sum);
    }
}

