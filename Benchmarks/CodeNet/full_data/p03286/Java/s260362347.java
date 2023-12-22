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
StringBuilder ans = new StringBuilder();

public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        if(N == 0) out.println(0);
        else {
            rec(N);
            out.println(ans.reverse());
        }
    }

void rec(int N) {
        if(N==0)return;
        ans.append(yo(N, -2));
        rec(syo(N, -2));
    }

int syo(int n1, int n2) {
        if(n1>=0) return n1/n2;
        else return (n1-Math.abs(n2)+1)/n2;
    }

int yo(int n1, int n2) {
        if(n1>=0) return n1%n2;
        else return ((Math.abs(n2) + n1%n2)%n2);
    }

}
}

