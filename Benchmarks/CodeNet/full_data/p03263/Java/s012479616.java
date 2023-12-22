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
        int H = in.nextInt();
        int W = in.nextInt();
        int a[][] = new int[H][W];
        for(int ih=0; ih<H; ih++){
            for(int iw=0; iw<W; iw++){
                a[ih][iw] = in.nextInt();
            }
        }
        int n = 0;
        String ans[] = new String[H*W];
        for(int ih=0; ih<H; ih++){
            for(int iw=0; iw<W-1; iw++){
                if(a[ih][iw]%2 != 0){
                    ans[n] = (ih+1)+" "+(iw+1)+" "+(ih+1)+" "+(iw+2);
                    n++;
                    a[ih][iw+1]++;
                }
            }
        }
        for(int ih=0; ih<H-1; ih++){
            if(a[ih][W-1]%2 != 0){
                ans[n] = (ih+1)+" "+W+" "+(ih+2)+" "+W;
                n++;
                a[ih+1][W-1]++;
            }
        }
        out.println(n);
        for(int i=0; i<n; i++) out.println(ans[i]);
    }

}
}

