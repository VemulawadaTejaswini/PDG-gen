import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		int[] a = new int[100000];
		
		Boolean bool = false;
		int L = -1;
		int R = 0;
		int pn = 0;
		int nn = 0;
		int zn = 0;
		for (int i=1;i<=N;i++)
		{
			a[i] = in.nextInt();
			if (a[i] > 0) 
				pn ++;
			else if (a[i] < 0)
				nn ++;
			else
			{
				zn ++;
				R = i;
			}
			
			
			if (!bool&&a[i] > 0)
			{
				L = i;
				bool = true;
			}
		}
		
		long sum = 0;
		
		if (zn == 1) {
			if (R == 1) {
				sum = a[K-1];
			} else if (R==N) {
				sum = (a[N-K+1]) * -1;
			} else {
				if (a[R-1]*-1 < a[R+1]) {
					if (nn >= K-1) {
						sum = (a[R-K+1]) * -1;
					} else {
						sum = a[R + (K-1) - nn] *2 ;
						sum += a[1] * -1; 
					}
				} else {
					if (pn >= K-1) {
						sum = a[R+K-1];
					}else {
						sum = a[R + (pn - K + 1)] * -2;
						sum += a[N];
					}
				}
				
				
			}
			
		}else {
			if (L == 1) {
				sum = a[K];
			}else if (L == -1) {
				sum = a[N-K] * -1;
			}else {
				if (a[L-1]*-1< a[L])
				{
					if (nn >= K) {
						sum = a[L-1-K] * -1;
					}else {
						sum = a[L + K - nn] * 2;
						sum += a[1] * -1;
					}
				}else {
					if (pn >= K) {
						sum = a[L+K-1];
					}else {
						sum = a[L- (K-pn) -1] * -2;
						sum += a[N];
					}
				}
			}
		}
		System.out.println(sum);

	}

}
