import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int[] C = new int[N];
        int[] D = new int[N + 1];
        int[] F = new int[N + 1];
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt() - 1;
            C[A]++;
        }
        for (int i = 0; i < N; i++) {
            D[C[i]]++;
        }
        int nowSum = N-D[0];
        int lSum = 0*D[0];
        F[1] = nowSum;
        for (int i = 2; i <= N; i++) {
            nowSum -= D[i-1];
            lSum += (i-1)*D[i-1];
            F[i] = lSum/i + nowSum ;
        }
        int x = N;
        for(int nowK=1;nowK<=N;nowK++) {
            while (x > 0 && F[x] < nowK) {
                x--;
            }
            System.out.println(x);
        }
    }
}