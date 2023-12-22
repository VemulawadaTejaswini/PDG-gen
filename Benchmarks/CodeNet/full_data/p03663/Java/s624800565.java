import java.util.*;

public class Main {
	static Scanner sc;
	static boolean DEBUG=false;
	static int N = 96754;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int B = 12;
		long[] base = new long[B];
		base[1] = 1;
		for(int i=2; i<B; i++)
			base[i] = base[i-1]*10;
		
		if(query(base[B-1])) {
			for(int i=1; i<B; i++) {
				if(!query(base[i])) {
					answer(base[i]);
					break;
				}
			}
		} else {
			int d = B-1;
			for(; d>=1; d--) {
				if(query(base[d])) {
					break;
				}
			}
			long min = base[d];
			long max = base[d+1]-1;
			while(min+1<max) {
				long mid = (min+max)/2;
				if(query(mid*10))
					max = mid;
				else
					min = mid;
			}
			answer(max);
		}
		
		sc.close();
	}
	
	static boolean query(long n) {
		if(DEBUG) {
			return (n<N && (String.valueOf(n).compareTo(String.valueOf(N)))<0)
					|| (n>N && (String.valueOf(n).compareTo(String.valueOf(N)))>0);
		}
		System.out.println("? "+n);
		return sc.next().equals("Y");
	}
	
	static void answer(long n) {
		System.out.println("! "+n);
	}
}
