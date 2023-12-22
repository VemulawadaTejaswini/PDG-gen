import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] x = new int[m];
		int[] y = new int[m];

		int[] c = new int[n];
		boolean[] p = new boolean[n];
		Arrays.fill(c, 1);
		p[0] = true;
		for( int i=0 ; i<m ; i++ ) {
			int f = sc.nextInt()-1;
			int t = sc.nextInt()-1;
			x[i] = f;
			y[i] = t;
			
			p[t] = p[f];
			if ( c[f] == 1 ) {
				p[f] = false;
			}
			c[f]--;
			c[t]++;
		}
		
		int r =0;
		for( int i=0 ; i<n ;i++ ) {
			if(p[i])r++;
		}
		
		System.out.println(r);
		
		
	}

}
