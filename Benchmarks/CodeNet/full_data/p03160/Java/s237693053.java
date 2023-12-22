import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class FastReader{
	BufferedReader br;
	StringTokenizer tok;
	
	FastReader(){
		br=new BufferedReader(new InputStreamReader(System.in));
	}
	
	String next() {
		if(tok==null || (!tok.hasMoreTokens())) {
			try {
				tok = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return tok.nextToken();
	}
	int nextInt() {
		return Integer.parseInt(this.next());
	}
	String nextLine() {
		String s="";
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}
}

public class Main {
	
	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int n=fr.nextInt();
		int arr[] = new int[n]; 
		for(int i=0; i<n; i++)
			arr[i] = fr.nextInt();
		int dp[] = new int[n];
		dp[1] = Math.abs(arr[1]-arr[0]);
		for(int i=2; i<n; i++) 
			dp[i] = Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]), dp[i-2]+Math.abs(arr[i]-arr[i-2]));
		System.out.println(dp[n-1]);
	}
}
