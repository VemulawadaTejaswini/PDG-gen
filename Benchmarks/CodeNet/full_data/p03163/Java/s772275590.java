import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class graph {
	static long  memo[][];
	static int we[];
	static long v[];
	public static long dp(int i,int w) {
        if(i==we.length||w==0)return 0;
		if(we[i]>w) {return dp(i+1,w);}else {
		 return	Math.max(dp(i+1,w), dp(i+1,w-we[i])+v[i]);
		}
		}
	
	public static void main(String []args) throws IOException {
 		PrintWriter pw =new PrintWriter(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		we=new int [n];
		v=new long[n];
		for(int i=0;i<n;i++) {
			st =new StringTokenizer(br.readLine());
			we[i]=Integer.parseInt(st.nextToken());
			v[i]=Long.parseLong(st.nextToken());
		}
		System.out.println(dp(0,w));
		
		
}}