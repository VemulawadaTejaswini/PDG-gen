import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] B = new int[N];
        int[] A = new int[N];
        for(int i = 0; i < N-1; i++) {
            B[i] = scanner.nextInt();
        }
        int ans = 0;
        ans = A[0] = B[0];
        for(int i = 1; i < N-1; i++) {
            ans += A[i] = Math.min(B[i], B[i-1]);
        }
        ans += A[N-1] = B[N-2];

        System.out.println(ans);
    }
}