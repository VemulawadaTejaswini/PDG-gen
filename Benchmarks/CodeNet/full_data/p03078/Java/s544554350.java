import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[x];
		long[] b = new long[y];
		long[] c = new long[z];
		int i;
		for(i=0; i<x; i++) {
			a[i] = sc.nextLong();
		}
		for(i=0; i<y; i++) {
			b[i] = sc.nextLong();
		}
		for(i=0; i<z; i++) {
			c[i] = sc.nextLong();
		}
		sc.close();
		sc = null;
		Long[] sum = new Long[x*y*z];
		int j,m;
		int n=0;
		for(i=0; i<x; i++) {
			for(j=0; j<y; j++) {
				for(m=0; m<z; m++) {
					sum[n] = a[i] + b[j] + c[m];
					n++;
				}
			}
		}
		Arrays.sort(sum, Comparator.reverseOrder());
		for(i=0; i<k; i++) {
			System.out.println(sum[i]);
		}
	}
}