import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
    	FastScanner fs = new FastScanner(System.in);
        int n = fs.nextInt(), k = fs.nextInt();
        int sum[][] = new int[2*k+1][2*k+1];
        int t[][] = new int[2*k][2*k];
        for(int i=0;i<n;i++){
            int x = fs.nextInt(), y = fs.nextInt();
            String c = fs.next();
            x %= 2*k;
            y %= 2*k;
            if(c.equals("B")){
            	x = (x + k) % 2*k;
            }
            if(x>=k&&y>=k){
                x-=k;
                y-=k;
            }
            if(y>=k&&x<k){
                int tmp = x;
                x = y;
                y = tmp;
            }
            t[x][y]++;
        }

        
        for(int i=0;i<2*k;i++){
            for(int j=0;j<k;j++){
                sum[i+1][j+1] = sum[i+1][j] + sum[i][j+1] -sum[i][j] + t[i][j];
            }
        }

        int ans = 0;
        for(int i=0;i<=k;i++){
            int t_ans = sum[k+i][k] - sum[i][k];
            ans = Math.max(ans , t_ans); 
        }
        System.out.println(ans);
    }
}












//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
