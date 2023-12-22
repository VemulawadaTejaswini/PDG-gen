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
public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int K = in.nextInt();
        int x[] = new int[N];
        for(int i=0; i<N; i++){
            x[i] = in.nextInt();
        }
        int ans = 1<<30;
        for (int i = 0; i <= N-K; i++) {
            ans = Math.min(ans, x[K-1+i]-x[i]+Math.min(Math.abs(x[K-1+i]), Math.abs(x[i])));
        }
        out.println(ans);
       
    }

}
}

