
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
        int A[] = new int[N];
        int sum = 0;

        for(int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
            sum += A[i];
        }

        double limit = sum/(double)(4*M);
        int cand = 0;
        for(int i = 0; i < N; i++) {
            if((double)A[i] >= limit)
                cand++;
        }

        if(cand >= M)
            os.println("Yes");
        else
            os.println("No");
    }


}