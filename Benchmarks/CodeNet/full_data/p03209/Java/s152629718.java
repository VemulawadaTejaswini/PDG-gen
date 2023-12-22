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
int N;
long X;
long sum = 0;

public void solve(int testNumber, Scanner in, PrintWriter out) {
        N = in.nextInt();
        X = in.nextLong();
        long max = 1;
        for(int i=0; i<=N-1; i++){
            max = max*2 + 3;
        }
        dfs(1, max, N);
        out.println(sum);
    }

void dfs(long i1, long i2, int d) {
        if (d == 0) {
            if(i1 <= X){
                sum++;
            }
            return;
        }
        long mid = (i1 + i2)/2;
        if (mid <= X) {
            sum++;
            dfs(mid+1, i2-1, d-1);
            for(int i=0; i<=d-1; i++){
                sum+=pow(2, i);
            }
        } else {
            dfs(i1+1, mid-1, d-1);
        }
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

