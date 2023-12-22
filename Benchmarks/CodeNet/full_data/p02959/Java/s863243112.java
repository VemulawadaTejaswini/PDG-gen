import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];
        int[] B = new int[N];
        int defeat = 0;
        for (int i = 0; i < N + 1; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
            if (A[i] - B[i] < 0) {
                if (A[i + 1] + (A[i] - B[i]) < 0) {
                    defeat += A[i] + A[i + 1];
                    A[i + 1] = A[i + 1] + (A[i] - B[i]);
                } else {
                    defeat += B[i];
                }
            } else {
                defeat += B[i];
            }
        }

        System.out.println(defeat);
    }
}