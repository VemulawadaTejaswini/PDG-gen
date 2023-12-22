import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] ary = new long[87];
		ary[0] = 2;
		ary[1] = 1;
		
		for ( int i = 2; i < n+1; i++ ) {
			ary[i] = ary[i-1] + ary[i-2];
		}
	
		System.out.print(ary[n]);
		
	}
}