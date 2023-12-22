import java.util.Scanner;

public class Main {
    public static void main(String[] atrgs){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N];
        for(int i = 0; i < N+1; i++) {
            A[i] = scanner.nextInt();
        }
        for(int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        long count= 0;
        for(int i = 0; i < N; i++) {
            int left = Math.min(A[i], B[i]);
            count += left;
            A[i] -= left;
            B[i] -= left;

            int right = Math.min(A[i + 1], B[i]);
            count += right;
            A[i + 1] -= right;
            B[i] -= right;
        }
        System.out.println(count);
    }
}