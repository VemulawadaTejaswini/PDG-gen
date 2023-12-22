
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		double[] ratio = new double[n-1];
		for (int i=0;i<n-1;i++) {
			if (a[i]<a[i+1]) {
				int x = a[i];
				int y = a[i+1];
				int count = 0;
				while (x<y) {
					x*=2;
					count++;
				}
				ratio[i] = x==y ? count : count-0.5;
			} else if (a[i]>a[i+1]) {
				int x = a[i+1];
				int y = a[i];
				int count = 0;
				while (x<y) {
					x*=2;
					count++;
				}
				ratio[i] = -( x==y ? count : count-0.5);
			} else {
				ratio[i]=0;
			}
		}

		int[] left = new int[n];
		int[] right = new int[n];

		for (int i=0;i<n-1;i++) {
			left[i+1] = left[i] + (ratio[i]<=0 ? 0 : (int)Math.ceil(ratio[i]/2)*2*(i+1));

		}
		for (int i=n-1;i>0;i--) {
			right[i-1] = right[i] + (ratio[i-1]>=0 ? 0 : (int)Math.ceil(-ratio[i-1]/2)*2*(n-i));
		}

		int ans = right[0];
		for (int i=0;i<n-1;i++) {
			ans=Math.min(ans, left[i]+(i+1)+right[i+1]);
		}
		ans = Math.min(ans, left[n-1]+n);
		
		System.out.println(ans);
	}


}
