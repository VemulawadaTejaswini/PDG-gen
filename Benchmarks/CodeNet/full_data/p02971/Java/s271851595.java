import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        Integer[][] A = new Integer[N][2];
        for (int i = 0; i < N; i++) {
            A[i][0] = i;
            A[i][1] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        // 値の降順ソート
        Arrays.sort(A, (a, b) -> b[1] - a[1]);

        // 最大値のindexであれば index: 1, そうでなければ index: 0
        for (int i = 0; i < N; i++) {
            if (A[0][0] == i) {
                System.out.println(A[1][1]);
            } else {
                System.out.println(A[0][1]);
            }
        }

        for (int n : ans) {
            System.out.println(n);
        }
    }
}
