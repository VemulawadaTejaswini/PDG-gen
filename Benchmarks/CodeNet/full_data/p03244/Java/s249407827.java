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
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskC   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int ve[] = new int[N/2];
        int vo[] = new int[N/2];
        for (int i=0; i<N/2; i++) {
            ve[i] = in.nextInt();
            vo[i] = in.nextInt();
        }
        Arrays.sort(ve);
        Arrays.sort(vo);
        int idx1 = 0;
        int idx2 = 0;
        int oi1 = 0;
        int ei1 = 0;
        int oi2 = 0;
        int ei2 = 0;
        int nume = 0;
        int numo = 0;
        while (idx2 != N/2){
            while(ve[idx1] == ve[idx2]){
                idx2++;
                if(idx2 == N/2) break;
            }
            if(ei1 <= idx2 - idx1){
                ei2 = ei1;
                ei1 = idx2 - idx1;
                nume = ve[idx1];
            } else {
                ei2 = Math.max(ei2, idx2 - idx1);
            }
            idx1 = idx2;
        }
        idx1 = 0;
        idx2 = 0;
        while (idx2 != N/2){
            while(vo[idx1] == vo[idx2]){
                idx2++;
                if(idx2 == N/2) break;
            }
            if(oi1 <= idx2 - idx1){
                oi2 = oi1;
                oi1 = idx2 - idx1;
                numo = vo[idx1];
            } else {
                oi2 = Math.max(oi2, idx2 - idx1);
            }
            idx1 = idx2;
        }
        if(nume != numo) out.println(N - oi1 - ei1);
        else out.println(Math.min(N - oi1 - ei2, N - oi2 - ei1));
    }

}
}

