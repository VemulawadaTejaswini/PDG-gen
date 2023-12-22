import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }

        if (N == 2) {
            os.println(Math.max(A[0], A[1]));
            return;
        }

        long zero[] = new long[N];
        long one[] = new long[N];
        long two[] = new long[N];

        int upperZero = 0;
        int upperOne = 0;
        if (N % 2 == 0){
            upperZero = N-1;
            upperOne = N;
        } else {
            upperZero = N-2;
            upperOne = N-1;
        }


        zero[0] = A[0];
        for(int i = 2; i < upperZero; i += 2) {
            zero[i] += zero[i-2] + A[i];
        }
        one[1] = A[1];
        for(int i = 3; i < upperOne; i += 2) {
            one[i] += Math.max(zero[i-3] + A[i], one[i-2] + A[i]);
        }

        two[2] = A[2];
        for(int i = 4; i < N; i += 2) {
            two[i] += Math.max(Math.max(A[i]+one[i-3], A[i]+zero[i-4]), two[i-2]+A[i]);
        }

        if(N%2 != 0)
            os.println(Math.max(Math.max(two[N-1], one[N-2]), zero[N-3]));
        else
            os.println(Math.max(one[N-1], zero[N-2]));
    }
}