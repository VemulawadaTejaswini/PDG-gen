import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B= new int[N];
        int th = K / 2;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i]=A[i];
            if (A[i] > th) {
                A[i]-=K;
            }
        }

        Arrays.sort(A);
        Arrays.sort(B);

        System.out.println(Math.min(Math.abs(A[0]-A[A.length-1]), Math.abs(B[0]-B[A.length-1])));

    }
}