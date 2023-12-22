import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        int[] factor = factor(M);
        out.println(M/factor[binary_search(N, factor)]);
    }

public   static int[] factor(long n) {
        int[] ret = new int[(int)Math.sqrt(n)];
        int pos = 0;
        for(int i = 1; i*i <= n; i++){
            if(n%i==0) ret[pos++] = i;
        }
        int max = pos;
        if(ret[max-1] == Math.sqrt(n)) max-=1;
        for(int i = max-1; i >= 0; i--){
            ret[pos++] = (int)(n/ret[i]);
        }
        return Arrays.copyOf(ret, pos);
    }

boolean isOK(int index, int key, int[] a) {
        if (a[index] >= key) return true;
        else return false;
    }

int binary_search(int key, int[] a) {
        int ng = -1;
        int ok = (int)a.length - 1;
        if(!isOK(ok, key, a)){
            return 1 << 29;
        }
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;

            if (isOK(mid, key, a)) ok = mid;
            else ng = mid;
        }
        return ok;
    }

}
}

