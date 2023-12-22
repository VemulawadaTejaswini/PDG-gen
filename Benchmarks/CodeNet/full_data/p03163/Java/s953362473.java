import java.util.*;
import java.io.*;

public class Main {
	
	static long[] values;
	static long[] weights;
	static long w;
	static long n;
	static long[][]dp;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		w=sc.nextInt();
		weights=new long[(int)n];
		values=new long[(int)n];
		
		dp=new long[(int)n][(int)w+1];
		
		
		
		for(int i=0;i<n;i++) {
			weights[i]=sc.nextInt();
			values[i]=sc.nextInt();
		}
		
		for(long[] x:dp) {
			Arrays.fill(x, -1);
		}
		
		System.out.println(rec(0,w));
	
	
	}
	
	public static long rec(long i,long rem) {
		if(rem<0) {
			return (long) -1e9;
		}
		if(i>=n) {
			return 0;
		}
		if(dp[(int)i][(int)rem]!=-1) {
			return dp[(int)i][(int)rem];
		}
		
		long n=-(Integer.MAX_VALUE);
		long y=-(Integer.MAX_VALUE);
		if(rem-weights[(int)i]>=0) {
			y= values[(int)i]  +   rec(i+1,rem-weights[(int)i]);  //take
		}
		n= rec(i+1,rem);  //leave
		
		return(dp[(int)i][(int)rem]=Math.max(n, y));
		
		
	}
	
}
