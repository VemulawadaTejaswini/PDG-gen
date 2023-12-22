
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = sc.nextInt();
		long s[] = new long[A+2];
		long t[] = new long[B+2];
		for(int i=1; i<=A; i++) {
			s[i]=sc.nextLong();
		}
		for(int i=1; i<=B; i++) {
			t[i]=sc.nextLong();
		}

		long INF = (long)10e13;

		s[0] = -INF;
		t[0] = -INF;
		s[A+1] = INF;
		t[B+1] = INF;

		long a[];
		long b[];



		for(int i=0; i<Q; i++) {
			long x = sc.nextLong();
			long ans = INF;
			for(int j=0; j<2; j++) {
				if(j==0) {
					a=s;
					b=t;
				}else {
					a=t;
					b=s;
				}
				for(int k=0; k<2; k++) {
					int apos = binsl(a, x)+k;
					long av = a[apos];
					if(av==INF) continue;
					for(int l=0; l<2; l++) {
						int bpos = binsl(b, av)+l;
						long bv = b[bpos];
						if(bv==INF) continue;
						ans = Math.min(ans, Math.abs(x-av) + Math.abs(av-bv)) ;
					}
				}
			}
			System.out.println(ans);
		}


		sc.close();
	}

	private int binsl(long arr[],  long v) {
		int l=0;
		int r=arr.length;
		while((l+1<r)) {
			int mid = (l+r)/2;
			//System.out.println(l + " " + r + " " + mid);
			if(arr[mid]<=v) {
				l=mid;
			}else {
				r=mid;
			}
		}
		return l;
	}


}
