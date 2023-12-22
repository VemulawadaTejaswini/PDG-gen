import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        Integer heavyA[] = new Integer[N];
        for(int i = 0; i < N; i++) {
            heavyA[i] = scan.nextInt();
        }

        Arrays.sort(heavyA, Collections.reverseOrder());
        int A[] = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = heavyA[i];
        }

        for(int i = 0; i < M; i++) {
            if(A[0] == 0)
                break;
            A[0] = (int)(Math.floor((double)A[0] / 2.0));

            for(int j = 0; j < M-1-i; j++) {
                if(j <= N - 2 && A[j] < A[j+1]) {
                    Integer temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                } else {
                    break;
                }
            }
        }

        long sum = 0;
        for(int i = 0; i < N; i++) {
            sum += A[i];
        }
        os.println(sum);
    }
}