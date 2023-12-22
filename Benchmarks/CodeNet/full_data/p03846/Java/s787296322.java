import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        long answer = 1;
        if (N % 2 == 0) {
            for (int i = 0; i < N / 2; i++) {
                if (A[2*i] == 1 + 2 * i && A[2*i+1] == 1 + 2 * i) {
                    answer = answer * 2 % 1000000007;
                    continue;
                }
                answer = 0;
                break;
            }
        } else {
            for (int i = 0; i < (N-1) / 2; i++) {
                if (A[2*i+1] == 2 * (i+1) && A[2*i+2] == 2 * (i+1)) {
                    answer = answer * 2 % 1000000007;
                    continue;
                }
                answer = 0;
                break;
            }
        }
        System.out.println(answer);
    }
}
