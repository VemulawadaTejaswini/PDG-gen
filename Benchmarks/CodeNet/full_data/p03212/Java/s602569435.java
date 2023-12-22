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
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskC   {
int N;

public void solve(int testNumber, Scanner in, PrintWriter out) {
        N = in.nextInt();
        out.println(dfs(0,0,false,false,false));
    }

int dfs(int n, int keta, boolean o3, boolean o5, boolean o7) {
        int temp = 0;
        int ret = 0;
        if(keta == 9){
            if(o3 && o5 && o7 && n<=N && n!=0){
                return 1;
            }
            return 0;
        }
        if(n == 0){
            ret += dfs(n, keta+1, o3, o5, o7);
        }
        ret += dfs(n*10 + 3, keta+1, true, o5, o7);
        ret += dfs(n*10 + 5, keta+1, o3, true, o7);
        ret += dfs(n*10 + 7, keta+1, o3, o5, true);
        return ret;
    }

}
}

