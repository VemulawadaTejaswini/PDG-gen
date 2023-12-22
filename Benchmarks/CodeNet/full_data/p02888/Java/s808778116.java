import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        int ct = 0;
        for(int i = 0; i < N - 2; i++) {
            for(int j = i + 1; j < N - 1; j++) {
                for(int k = j + 1; k < N; k++) {
                    if(A[i] < A[j] + A[k] && A[j] < A[i] + A[k] && A[k] < A[i] + A[j]) {
                        ct += 1;
                    } else {
                        continue;
                    }
                }
            }
        }

        System.out.println(ct);
    }
}
