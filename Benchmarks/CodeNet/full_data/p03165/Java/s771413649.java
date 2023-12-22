
import java.io.*; 
import java.util.*;

class LCS 
{ 
	static char []  X , Y;
	static String lcs(int m, int n) 
	{ 
		int[][] L = new int[m+1][n+1]; 


		for (int i=0; i<=m; i++) 
		{ 
			for (int j=0; j<=n; j++) 
			{ 
				if (i == 0 || j == 0) 
					L[i][j] = 0; 
				else if (X[i-1] == Y[j-1]) 
					L[i][j] = L[i-1][j-1] + 1; 
				else
					L[i][j] = Math.max(L[i-1][j], L[i][j-1]); 
			} 
		} 


		int index = L[m][n]; 
		int temp = index; 


		char[] lcs = new char[index+1]; 
		lcs[index] = '\u0000'; 

		int i = m; 
		int j = n; 
		while (i > 0 && j > 0) 
		{ 

			if (X[i-1] == Y[j-1]) 
			{ 
	
				lcs[index-1] = X[i-1]; 
				
				i--; 
				j--; 
				index--;	 
			} 


			else if (L[i-1][j] > L[i][j-1]) 
				i--; 
			else
				j--; 
		} 
		StringBuilder sb = new StringBuilder();
		for(int k=0;k<=temp;k++) 
			sb.append(lcs[k]);
		return sb.toString();
	} 
	
	public static void main (String[] args) throws IOException 
	{ 
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		 X = sc.next().toCharArray();
		 Y = sc.next().toCharArray();
		int m = X.length; 
		int n = Y.length; 
		pw.println(lcs(m, n)); 
		pw.close();
	} 
	
} 
class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream s) {
		br = new BufferedReader(new InputStreamReader(s));
	}

	public Scanner(String file) throws FileNotFoundException {
		br = new BufferedReader(new FileReader(file));
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
	public int[] nextIntArr(int length) throws IOException{
		int[] arr = new int[length];
		for(int i = 0 ; i < length ; i++)
			arr[i] = Integer.parseInt(next());
		return arr;
	}
	public boolean ready() throws IOException {
		return br.ready();
	}
 }


