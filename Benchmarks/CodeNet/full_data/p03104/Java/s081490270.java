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
        long A = in.nextLong();
        long B = in.nextLong();
        int bit[] = new int[40];

        if((B-A+1)%2 == 0){
            bit[0] = (int)((B-A+1)/2)%2;
        } else {
            bit[0] = (int)((B-A)/2 + B%2)%2;
        }

        for (int i=1; i<40; i++) {
            long ai = (long) (A % Math.pow(2, i+1));
            long bi = (long) (B % Math.pow(2, i+1));
            if(ai < Math.pow(2, i) && bi < Math.pow(2, i)){
                bit[i] = 0;
            } else if(ai >= Math.pow(2, i) && bi >= Math.pow(2, i)){
                bit[i] = (int) ((Math.max(ai, bi) - Math.min(ai, bi) + 1)%2);
            } else {
                if(bi > ai){
                    bit[i] = (int) (bi + 1)%2;
                } else {
                    bit[i] = (int) (ai)%2;
                }
            }
        }

        long sum = 0;
        for (int i=0; i<40; i++) {
            sum += bit[i] * Math.pow(2, i);
        }
        out.println(sum);
}

}
}

