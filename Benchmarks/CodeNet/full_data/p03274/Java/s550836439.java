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
        int xm2[] = new int[N];
        int xp2[] = new int[N];
        boolean mex = false;
        boolean pex = false;
        for(int i=0; i<N; i++){
            int t = in.nextInt();
            if(t>0){
                xm2[i] = t;
                xp2[i] = t*2;
                pex = true;
            }
            else{
                xm2[i] = t*2;
                xp2[i] = t;
                mex = true;
            }
        }
        if(!pex) out.println(xp2[N-K]);
        else if(!mex) out.println(xm2[K-1]);
        else{
            int mmin = xm2[K-1] - xm2[0];
            int pmin = xp2[K-1] - xp2[0];
            for (int i = 0; i <= N-K-1; i++) {
                mmin = Math.min(mmin, xm2[K+i] - xm2[i+1]);
                pmin = Math.min(pmin, xp2[K+i] - xp2[i+1]);
            }
            out.println(Math.min(mmin, pmin));
        }
    }

}
}

