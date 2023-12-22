import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextLong();
		}
		for(int i=0;i<n;i++) {
			b[i] = in.nextLong();
		}
		in.close();
		long[] pow2 = new long[29];
		pow2[0] = 1;
		for(int i=1;i<=28;i++) {
			pow2[i] = pow2[i-1]*2;
		}
		long ans = 0;
		for(int k=0;k<28;k++) {
			long[] tmpa = new long[n];
			long[] tmpb = new long[n];
			for(int i=0;i<n;i++) {
				tmpa[i] = a[i] % pow2[k+1];
				tmpb[i] = (b[i] % pow2[k+1])*2;
			}
			Arrays.sort(tmpb);
			long count = 0;
			for(int i=0;i<n;i++) {
				long start1 = Arrays.binarySearch(tmpb, (pow2[k]-tmpa[i])*2-1);
				start1 = start1<0 ? -(start1+1):start1+1;
				long end1 = Arrays.binarySearch(tmpb, (pow2[k]*2-tmpa[i])*2-1);
				end1 = end1<0 ? -(end1+1):end1+1;
				long start2 = Arrays.binarySearch(tmpb, (pow2[k]*3-tmpa[i])*2-1);
				start2 = start2<0 ? -(start2+1):start2+1;
				long end2 = Arrays.binarySearch(tmpb, (pow2[k]*4-tmpa[i])*2-1);
				end2 = end2<0 ? -(end2+1):end2+1;
				count += (end1 - start1)%2 + (end2 - start2)%2;
				count = count%2;
			}
			if(count%2==1) ans += pow2[k];
		}
		System.out.println(ans);

	}

}
