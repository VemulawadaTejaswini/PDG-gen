
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int a[] = new int[n];
		long s[] = new long[n+1];
		for(int i = 0; i < n ; i++){
			a[i] = sc.nextInt();
			s[i+1] = s[i] + a[i];
		}
		
		
		long ans = s[n];
		for(int i=2; i < n ; i++){
			
			long pq = s[i];
			
			long pqmid = pq/2;
			
			int x = Arrays.binarySearch(s, pqmid);
			if(x < 0){
				x = -x-1;
			}
			
			long min = s[n];
			int xxx = 0;
			
			for(int xx = x-1; xx < x+2;xx++){
				if(xx < 1) continue;
				if(xx == i) continue;
				
				long p = s[xx];
				long q = pq-p;
				
				if(min > Math.abs(p-q)){
					min = Math.abs(p-q);
					xxx = xx; 
				}
			}
			
			
			long rs = s[n]-s[i];
			long rsmid = rs/2;
			
			int y = Arrays.binarySearch(s, pq+rsmid);
			if(y < 0){
				y = -y-1;
			}
			min = s[n];
			int yyy = 0;
			for(int yy = y-1; yy < y+2;yy++){
				if(yy >= n) continue;
				if(yy == i) continue;
				long r = (s[yy]-s[i]);
				long ss = rs - r;

				if(min > Math.abs(r-ss)){
					min = Math.abs(r-ss);
					yyy = yy; 
				}
			}
			
			long p = s[xxx];
			long q = pq-p;
			long r = (s[yyy]-s[i]);
			long ss = rs - r;
			
			long mmmax = Math.max(Math.max(r, ss),Math.max(p,q));
			long mmmin = Math.min(Math.min(r, ss), Math.min(p, q));
			
			ans = Math.min(ans, mmmax - mmmin);
		}
		System.out.println(ans);
				
	}
}
