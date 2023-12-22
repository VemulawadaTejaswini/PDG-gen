import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskD   {
int[][] bA;
int N;
long memo[] = new long[50];

public void solve(int testNumber, Scanner in, PrintWriter out) {
        N = in.nextInt();
        long K = in.nextLong();
        long A[] = new long[N];
        for (int i=0; i<=N-1; i++) {
            A[i] = in.nextLong();
        }

        bA = new int[40][2];
        for (int i=0; i<=N-1; i++) {
            long ac = A[i];
            for (int j=0; ac > 0; j++) {
                bA[j][0] += ac % 2;
                ac /= 2;
            }
        }

        long kc = K;
        int keta = 0;
        for (int i=0; kc > 0; i++){
            bA[i][1] = (int)(kc%2);
            kc /= 2;
            keta++;
        }


        long ans = dfs(keta, false);


        for (int i=keta; i<=39; i++) {
            ans += pow(2, i) * bA[i][0];
        }
        out.println(ans);
    }

long dfs(int n, boolean free) {
        long ret = 0;
        if (n < 0) return -2;
        if (n == 0) return 0; 
        long pow2 = pow(2, n-1);

        boolean free2 = free;
        if(bA[n-1][1] == 1){
            free2 = true;
        }

        if(free){
            ret = dfs(n-1, free) + Math.max(bA[n-1][0], (N-bA[n-1][0])) * pow2;
        } else if(bA[n-1][1] == 0){
            ret = dfs(n-1, free2) + bA[n-1][0] * pow2;
        } else {
            ret = Math.max(dfs(n-1, free2) + bA[n-1][0] * pow2,
                    dfs(n-1, free) + (N-bA[n-1][0]) * pow2);
        }
        return memo[n] = ret;
    }

public   static long pow(long x, long n) {
        long sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) {  
                sum *= x;        
            }
            x *= x;              
            n >>= 1;
        }
        return sum;
    }

}
}

