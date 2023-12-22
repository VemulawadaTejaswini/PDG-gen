import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        //
        int val = 0;
        for(int i = 0; i < N; i++) {
            if(i % 2 == 0) val += A[i];
            else val -= A[i];
        }
        ans[0] = val / 2;
        for(int i = 1; i < N; i++) {
            ans[i] = A[i-1] - ans[i-1];
        }
        for(int i = 0; i < N; i++) {
            System.out.print(ans[i] * 2 + " ");
        }

    }
}