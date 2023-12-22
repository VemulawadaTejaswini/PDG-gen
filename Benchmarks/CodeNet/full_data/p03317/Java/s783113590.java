import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve3(N, K, A));
    }

    private static int solve3(int N, int K, int[] A) {
        int count = (N-1)/(K-1);

        if ((N-1)%(K-1) != 0) {
            count++;
        }

        return count;
    }
}