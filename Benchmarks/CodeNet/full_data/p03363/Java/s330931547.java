import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        // if (N == 0 && A[0] == 0) { System.out.println(1); return; }

        int answer = 0;
        int sums[] = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                sums[j] += A[i];
            }
            sums[i] = A[i];
            for (int j = 0; j < i+1; j++) {
                if (sums[j] == 0) { answer++; }
            }
            // System.out.println(Arrays.toString(sums));
        }

        System.out.println(answer);
    }
}
