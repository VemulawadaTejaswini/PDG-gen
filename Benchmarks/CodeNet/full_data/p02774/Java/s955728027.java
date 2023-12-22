import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];

        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        int num = N * (N-1) / 2;
        long[] times = new long[num];
        int k = 0;
        for (int i = 0; i < N ; i++){
            for (int j = i + 1; j < N; j++){
                times[k] = A[i] * A[j];
                k++;
            }
        }
        Arrays.sort(times);
        System.out.println(times[K-1]);
    }
}
