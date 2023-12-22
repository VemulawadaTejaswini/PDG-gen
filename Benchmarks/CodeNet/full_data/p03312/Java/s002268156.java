
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		long[] b = new long[n];
		b[0]=a[0];
		for (int i=1;i<n;i++) {
			b[i]=b[i-1]+a[i];
		}

		long ans = Long.MAX_VALUE;
		long[] tmpArray = new long [4];
		for (int i=1;i<n-1;i++) {
			int tmp = Arrays.binarySearch(b, b[i]/2);

			if (tmp >= 0) {
				tmpArray[0] = b[tmp];
			} else {
				if (tmp==-1) {
					tmpArray[0]=b[0];
				} else if (b[-tmp-1] < b[i]-b[-tmp-2]) {
					tmpArray[0]=b[-tmp-1];
				} else {
					tmpArray[0]=b[-tmp-2];
				}
			}
			tmpArray[1]= b[i]-tmpArray[0];

			tmp = Arrays.binarySearch(b,b[i]+(b[n-1]-b[i])/2);
			if (tmp >= 0) {
				tmpArray[2] = b[tmp]-b[i];
			} else {
				if (tmp==-i-2) {
					tmpArray[2] = b[i+1]-b[i];
				} else if (b[-tmp-1]-b[i] < b[n-1]-b[-tmp-2]) {
					tmpArray[2]=b[-tmp-1]-b[i];
				} else {
					tmpArray[2]=b[-tmp-2]-b[i];
				}
			}
			tmpArray[3]=b[n-1]-tmpArray[2]-b[i];
			Arrays.sort(tmpArray);
			ans = Math.min(ans, tmpArray[3]-tmpArray[0]);
		}
		System.out.println(ans);
	}



}
