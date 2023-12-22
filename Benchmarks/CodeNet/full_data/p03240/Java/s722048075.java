import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

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
public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int po[][] = new int[2][N];
        int h[] = new int[N];
        for (int i=0; i<N; i++) {
            po[0][i] = in.nextInt();
            po[1][i] = in.nextInt();
            h[i] = in.nextInt();
        }
        for(int cx = 0; cx<=100; cx++){
            loop:for(int cy = 0; cy<=100; cy++){
                int H = 0;
                ArrayList<Integer> pos0 = new ArrayList<>();
                for(int i = 0; i<N; i++){
                    if(h[i] == 0) {
                        pos0.add(i);
                        continue ;
                    }
                    if(H == 0) H = h[i] + Math.abs(po[0][i] - cx) + Math.abs(po[1][i] - cy);
                    if(h[i] + Math.abs(po[0][i] - cx) + Math.abs(po[1][i] - cy) != H) continue loop;
                }
                for(int i : pos0){
                    if(H - Math.abs(po[0][i] - cx) - Math.abs(po[1][i] - cy) > 0){
                        continue loop;
                    }
                }
                out.println(cx+" "+cy+" "+H);
            }
        }
    }

}
}

