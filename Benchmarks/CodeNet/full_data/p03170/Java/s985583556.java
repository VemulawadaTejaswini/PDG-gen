import java.io.*;
import java.util.*;
public class Main{
	final public static int MOD = (int)1e9+7;
	public static boolean dp[] =  new boolean[100001];
    public static void main(String[] args) throws IOException{
    	FastScanner sc = new FastScanner();
    	PrintWriter out = new PrintWriter(System.out);
    	int n= sc.nextInt();
    	int k= sc.nextInt();
    	int arr[] = new int[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	Arrays.sort(arr);
    	for(int i=0; i<arr[0]; i++) {
    		dp[i] = false;
    	}
    	first:for(int i=arr[0]; i<100001; i++) {
    		boolean good = false;
    		for(int j=0; j<n; j++) {
    			if(i-arr[j]<0) {
    				dp[i] = good;
    				continue first;
    			}
    			if(!dp[i-arr[j]]) good = true;
    		}
    		dp[i] = good;
    	}
    	if(dp[k])out.println("First");
    	else out.println("Second");
    	out.close();
    }
    public static class FastScanner {
    	BufferedReader br;
    	StringTokenizer st;

    	public FastScanner(String s) {
    		try {
    			br = new BufferedReader(new FileReader(s));
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		}
    	}

    	public FastScanner() {
    		br = new BufferedReader(new InputStreamReader(System.in));
    	}
    	
    	String nextToken() {
    		while (st == null || !st.hasMoreElements()) {
    			try {
    				st = new StringTokenizer(br.readLine());
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    		return st.nextToken();
    	}

    	String nextLine() {
    		st = null;
    		try {
    			return br.readLine();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		return null;
    	}

    	int nextInt() {
    		return Integer.parseInt(nextToken());
    	}

    	long nextLong() {
    		return Long.parseLong(nextToken());
    	}

    	double nextDouble() {
    		return Double.parseDouble(nextToken());
    	}
    }
}
