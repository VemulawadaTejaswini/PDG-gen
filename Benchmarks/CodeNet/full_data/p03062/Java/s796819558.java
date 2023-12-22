import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		
		for(int i = 0; i < n; i++) a[i] = sc.nextLong();
		
		int mincnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i] < 0) {
				mincnt++;
			}
		}
		
		if(mincnt%2==0) {
			System.out.println(Arrays.stream(a).map(Math::abs).sum());
		}else{
			long min = Long.MAX_VALUE;

			for(int i = 0; i < n; i++) {
				if(a[i] < 0) {
					min = Math.min(min, Math.abs(a[i]));
				}else {
					min = Math.min(min, a[i]);
				}
			}
			boolean ok = false;
			
			long sum= 0;
			
			for(long i:a) {
				if(!ok && i == min) {
					sum-=min;
					ok=true;
					continue;
				}
				sum+=Math.abs(i);
			}
			System.out.println(sum);
			
			
		}

	}

}
