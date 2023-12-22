
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0; i < N-1; i++) B[i] = sc.nextInt();
        B[N-1] = Integer.MAX_VALUE;
        A[0] = Math.min(B[0], B[1]);

        for(int i = 0; i < N-1; i++) {
            A[i+1] = Math.min(B[i], B[i+1]);
        }

        int res = 0;
        for(int i = 0; i < N; i++) {
            res += A[i];
        }
        System.out.println(res);
    }
}
