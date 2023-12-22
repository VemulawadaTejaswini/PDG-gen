import java.util.*;
import java.io.*;

public class Main {
	
	static int[] values;
	static int[] weights;
	static int w;
	static int n;
	static int best=0;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		w=sc.nextInt();
		weights=new int[n];
		values=new int[n];
		
		for(int i=0;i<n;i++) {
			weights[i]=sc.nextInt();
			values[i]=sc.nextInt();
		}
		
		rec(0,w,0);
		
		System.out.println(best);
	
	
	}
	
	public static void rec(int i,int rem,int sum) {
		
		
		if(sum>best) {
			best=sum;
		}
		
		if(i>=n) {
			return;
		}
		
		if(rem-weights[i]>=0)
			rec(i+1,rem-weights[i],sum+values[i]);  //take
		
		rec(i+1,rem,sum);  //leave
		
		
	}
	
}
