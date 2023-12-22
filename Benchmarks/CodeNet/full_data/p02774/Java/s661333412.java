import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int A[] = new int[N];
        for (int i=0;i<N;i++) A[i] = sc.nextInt();

        long B[] = new long[(N * (N-1) ) / 2];
        int idx = 0;
        for (int i=0;i<N;i++) {
            for (int j=i+1;j<N;j++) {
                B[idx++] = (long)A[i]*(long)A[j];
            }
        }

        Arrays.sort(B);
        System.out.println(B[K-1]);
    }
}
