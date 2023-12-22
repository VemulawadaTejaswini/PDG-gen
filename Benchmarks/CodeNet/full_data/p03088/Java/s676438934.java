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
        int m = 1_000_000_007;
        int dp[][][][] = new int[4][4][4][100];
        // 0A 1G 2C 3T

        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                for (int k=0; k<4; k++) {
                    dp[i][j][k][2] = 1;
                }
            }
        }
        dp[0][1][2][2] = 0;
        dp[0][2][1][2] = 0;
        dp[1][0][2][2] = 0;

        for (int c=2; c<=N-2; c++) {
            for (int i=1; i<=4; i++) {
                for (int j=1; j<=4; j++) {
                    for (int k=1; k<=4; k++) {
                        for (int l=1; l<=4; l++) {
                            if(isOk(i, j, k, l)){
                                dp[j-1][k-1][l-1][c+1] = (dp[j-1][k-1][l-1][c+1] + dp[i-1][j-1][k-1][c])%m;
                            }
                        }
                    }
                }
            }
        }

        int sum = 0;
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                for (int k=0; k<4; k++) {
                    sum = (sum + dp[i][j][k][N-1])%m;
                }
            }
        }
        out.println(sum);
    }

boolean isOk(int a, int b, int c, int d) {
        String s1 = String.valueOf(1000*a + 100*b + 10*c + d);
        String s2 = String.valueOf(1000*b + 100*a + 10*c + d);
        String s3 = String.valueOf(1000*a + 100*c + 10*b + d);
        String s4 = String.valueOf(1000*a + 100*b + 10*d + c);
        if(!s1.contains("123") && !s2.contains("123") && !s3.contains("123") && !s4.contains("123")){
            return true;
        } else {
            return false;
        }
    }

}
}

