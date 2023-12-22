import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		String string = sc.next();
		
		int n = string.length();
		
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			if (string.charAt(i) == 'R') {
				a[i] = 1; 
			}
		}
		
		int[] rightForLeft = new int[n];
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				rightForLeft[i] = c;
				c = 0;
			}
			else {
				c++;
			}
		}
		
		
		int[] leftForRight = new int[n];
		
		c = 0;
		for (int i = n-1; i >= 0; i--) {
			if (a[i] == 1) {
				leftForRight[i] = c;
				c = 0;
			}
			else {
				c++;
			}
		}
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			if (i > 0 ) {
				if (rightForLeft[i]%2 == 0) {
					ans[i] += rightForLeft[i]/2;
					ans[i-1] += rightForLeft[i]/2;
				}
				else {
					ans[i] += rightForLeft[i]/2;
					ans[i-1] += (rightForLeft[i]/2)+1;
				}
			}
				
			
			if (i < n-1) {
				if (leftForRight[i]%2 == 0) {
					ans[i] += leftForRight[i]/2;
					ans[i+1] += leftForRight[i]/2;
				}
				else {
					ans[i] += leftForRight[i]/2;
					ans[i+1] += (leftForRight[i]/2)+1;
				}
			}
				
			
			
		}
		
		
		for (int i = 0; i < n; i++) {
			out.print(ans[i]+" ");
		}
		
		
		
		out.flush();
	}
		
}	
	
class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
	}
	
	public Scanner (String file) throws IOException{
        br=new BufferedReader(new FileReader(file));
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public char nextChar() throws IOException {
		return next().charAt(0);
	}

	public Long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public boolean ready() throws IOException {
		return br.ready();
	}

	public void waitForInput() throws InterruptedException {
		Thread.sleep(3000);
	}


}

