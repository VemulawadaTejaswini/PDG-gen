import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	long mod = 998244353;

	boolean[][] contains = new boolean[0][0];

	void run() {
		int n = sc.nextInt();
		int a2[] = new int[n];
		int s = 0;
		for(int i = 0; i < n; i ++) {
			a2[i] = sc.nextInt();
			s += a2[i];
		}
		
		/*
		n=100;
		s=0;
		a = new int[n];
		for(int i =0 ; i < n;i++) {
			a[i] = i+1;
			s += a[i];
		}
		*/

		Arrays.sort(a2);

		int a[] = new int[n];
		for(int i = 0; i < n ; i ++) {
			a[i] = a2[n-1-i];
		}
		
		contains = new boolean[n+1][s+1];
		ArrayList<Integer> available = new ArrayList<Integer>();
		boolean[] c2 = new boolean[s+1]; 
		
		contains[0][0] = true;
		c2[0] = true;
		for(int i =0 ; i < n ; i ++) {
			for(int j = 0 ; j <= s; j++) {
				if(contains[i][j]) {
					contains[i+1][j] = true;
					if(j <= s - a[i]) {
						contains[i+1][j+a[i]] = true;
						if(!c2[j+a[i]]) {
							c2[j+a[i]] = true;
							available.add(j+a[i]);
						}
					}
				}
			}
		}
		Collections.sort(available);
		
		long ans = 0;
		
		for(int rr = 0; ;rr++) {
			int r = available.get(rr);
			if(r > s/3) {
				break;
			}
			
			int ind = Collections.binarySearch(available, s/2 - r + 1);
			if(ind < 0 ) {
				ind = -ind-1;
			}
			int start = Math.max(rr, ind);
			
			for(int gg = start; ;gg++) {


				int g = available.get(gg);
				if(g > s-g-r) {
					break;
				}
				int b = s - g - r;

				if(!c2[b]) {
					continue;
				}

				long c = calc(r,g,b,n-1,a,s) ;
				
				if(r == b) {
					
				}else if(r == g || b==g) {
					c*=3;
				}else {
					c*=6;
				}
				ans += c;
				ans = ans % mod;
			}
		}
		
		System.out.println(ans);
		
		
	}
	HashMap<String,Long> map = new HashMap<String,Long>();

	long calc(int rr, int gg,int bb,int i, int[] a, int s){
		if(!contains[i+1][rr] || !contains[i+1][gg] || !contains[i+1][bb]) {
			return 0;
		}
		int r = Math.min(bb,Math.min(rr, gg));
		int b = Math.max(bb,Math.max(rr, gg));
		int g = s - r-b;

		String key = r+"_"+g+"_"+b+"_"+i;
		if(map.containsKey(key)) {
			return map.get(key);
		}
		if(i == -1) {
			if(r==0 && g==0 && b==0) {
				return 1;
			}else {
				return 0;
			}
		}
		
		long count = 0;

		if(r >= a[i]) {
			count += calc(r-a[i], g, b,i-1,a,s-a[i]);
		}
		if(g >= a[i]) {
			count += calc(r, g-a[i], b,i-1,a,s-a[i]);
		}
		if(b >= a[i]) {
			count += calc(r, g, b-a[i],i-1,a,s-a[i]);
		}
		count %= mod;

		map.put(key,count);
		return count;
	}
}