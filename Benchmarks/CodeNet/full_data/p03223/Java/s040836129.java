import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A); // 昇順

        int[] B = new int[N];
        int temp = (int) Math.ceil((float)N/(float)2);
        int min = temp - 1;
        int max = min;
        B[min] = A[0];
        int prev = min;

        if (N == 3) {
            B[2] = A[1];
            B[0] = A[2];
        } else {
            for (int i = 1; i < temp; i++) {
                if (min == prev) {
                    max += 2;
                    B[max] = A[i];
                    prev = max;
                } else {
                    min -= 2;
                    B[min] = A[i];
                    prev = min;
                }
            }
            min = temp;
            max = min;
            B[min] = A[A.length - 1];
            prev = max;
            for (int i = 1; i < N / 2; i++) {
                if (max == prev) {
                    min -= 2;
                    B[min] = A[A.length - 1 - i];
                    prev = min;
                } else {
                    max += 2;
                    B[max] = A[A.length - 1 - i];
                    prev = max;
                }
            }
        }

        long result = 0;
        for (int i = 0; i < B.length-1; i++) {
            result += Math.abs(B[i] - B[i+1]);
        }
        System.out.println(result);
    }

}
