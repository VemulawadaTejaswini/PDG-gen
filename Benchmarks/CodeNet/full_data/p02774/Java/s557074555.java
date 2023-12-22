import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] A = new long[N];
		int negative = 0;
		int positive = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			if(A[i] > 0) {
				positive++;
			}
			else if(A[i] < 0) {
				negative++;
			}
		}
		Arrays.sort(A);
		long inf = A[0]*A[N-1]-1;
		long max = Math.max(A[0]*A[1], A[N-2]*A[N-1]);
		long mid;
		while(max-inf >= 0) {
			mid = (max+inf)/2;
			if(ok(A,K,mid)) {
				inf = mid+1;
			}
			else {
				max = mid-1;
			}
		}
		System.out.println(max);
	}
	static boolean ok(long[] a, long K,long mid) {
		int L = a.length;
		long sum = 0;
		for(int i = 0; i < L; i++) {
			long now = a[i];
			int left = 0;
			int right = L-1;
			if(now >= 0) {
				while(right-left>=0) {
					int center = (left+right)/2;
					if(now*a[center]<mid) {
						left = center+1;
					}
					else {
						right = center-1;
					}
				}
				sum += left;
			}
			else {
				while(right-left>=0) {
					int center = (left+right)/2;
					if(now*a[center]>=mid) {
						left = center+1;
					}
					else {
						right = center-1;
					}
				}
				sum+=L-left;
			}
			if((long)a[i]*a[i]<mid) {
				sum--;
			}
		}
		return sum/2 < K;
	}
}