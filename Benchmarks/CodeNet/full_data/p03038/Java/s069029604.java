
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n];
		
		for( int i=0 ; i<n ; i++ ) {
			a[i] = sc.nextInt();
		}

		Pair[] p = new Pair[m];
		for( int i=0 ; i<m ; i++ ) {
			p[i] = new Pair(sc.nextInt(),sc.nextInt());
		}

		Arrays.sort(a);
		Arrays.sort(p);
		
		for( int i=0 ; i< m ; i++) {
			int b = p[i].r;
			int c = p[i].l;
			
			for( int j=0 ; j<n ; j++ ) {
				if( a[j] < c) {
					a[j] = c;
					b--;
					if( b == 0 ) break;
				}
			}
		}
		
		long ans = 0;
		for( int i=0 ; i< n ; i++) {
			ans += a[i];
		}
		System.out.println(ans);
		
	}

	public static class Pair implements Comparable<Pair>{
		int r = 0;
		int l = 0;
		
		public Pair(int weight, int limit) {
			super();
			this.r = weight;
			this.l = limit;
		}

		@Override
		public int compareTo(Pair o) {
			if(false)
				// ASC
				return (l - o.l);
			else
				// DESC
				return -(l - o.l);
		}
	
	}
}

