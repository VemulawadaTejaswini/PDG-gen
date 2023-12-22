import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long []t = new long [n];
		
		for(int i = 0; i < n ;i++) {
			t[i] = sc.nextLong();
		}
		
		Arrays.sort(t);
		
		
		long ans = t[0];
		
		for(int i = 0; i < n-1 ;i++) {
			ans= lcm(t[i+1],ans);
		}
		
		System.out.println(ans);
		
	}
	
	static long lcm(long a, long b) {
		long c = a;
		c *= b;
		
		long temp;
		
		if(a%b == 0)
			return a;
		
		while((temp = a%b) != 0) {
			a = b;
			b = temp;
		}
		return c/b ;
		
		
	}

}
