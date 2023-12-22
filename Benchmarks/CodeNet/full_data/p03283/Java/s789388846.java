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
        int M = in.nextInt();
        int Q = in.nextInt();
        int a[][] = new int[N][N];
        for(int i = 0; i<M; i++) a[in.nextInt()-1][in.nextInt()-1]++;
        int[][] sum = sum2D(a);
        for(int i = 0; i<Q; i++){
            int p = in.nextInt();
            int q = in.nextInt();
            out.println(query(sum, p-1, p-1, q, q));
        }
    }

int[][] sum2D(int[][] a) {
        int ret[][] = new int[a.length+1][a[0].length+1];
        for(int j=0; j < a[0].length; j++){
            for(int i=0; i < a.length; i++){
                ret[i+1][j+1] = ret[i+1][j] + ret[i][j+1] - ret[i][j] + a[i][j];
            }
        }
        return ret;
    }

int query(int[][] sum, int sx, int sy, int fx, int fy) {
        return sum[fx][fy] - sum[sx][fy] - sum[fx][sy] + sum[sx][sy];
    }

}
}

