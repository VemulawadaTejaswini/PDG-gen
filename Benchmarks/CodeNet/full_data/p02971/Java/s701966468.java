import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (A[j] > ans[i] ) {
                    ans[i] = A[j];
                }
            }
        }

        for (int n : ans) {
            System.out.println(n);
        }
    }
}
