import java.util.*;
import java.io.*;

public class Main {
	
	static long[][]memo;
	static char[][] dots;
	static StringBuilder sb;
	static int num;
	static int h;
	static int w;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
			
		h=sc.nextInt();
		w=sc.nextInt();
		
		memo=new long[h][w];
		
		dots=new char[h][w];
		
		for(int i=0;i<h;i++) {
				String x=sc.next();
				dots[i]=x.toCharArray();
		}
		
		for(long[] x:memo) {
			Arrays.fill(x, -1);
		}
		
		num=0;
		
		long out=dp(0,0);
		
		System.out.println(out%((long)1e9+7));
		
		if(out==0) {
			System.out.println("There may be no paths.");
		}
		
		
		}
	
	public static long dp(int i,int j) {
		
		if(i==h|j==w) {
			return 0;
		}
		
		if(memo[i][j]!=-1) {
			return memo[i][j];
		}
		
		
		if(i==h-1&&j==w-1) {
			return 1;
		}
		
		
		long x=0;
		long y=0;
		
		if(dots[i][j]=='.') {
			x=dp(i+1,j);
			y=dp(i,1+j);
			return memo[i][j]=x+y;
		}else {
			return 0;
		}
		
		
		
	}
	
}

