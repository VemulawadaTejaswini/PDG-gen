import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int amax = 0;
		int bmin = Integer.MAX_VALUE;
		int bmini = 0;

		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			if(a[i] > amax) {
				amax = a[i];
			}
			if(b[i] < bmin) {
				bmin = b[i];
				bmini = i;
			}
		}
		scan.close();



		int[] min = new int[h+amax+1];
		for(int i = 1; i < a[bmini]+1; i++) {
			min[i] = bmin;
		}


		for(int i = a[bmini]+1; i < h+amax+1; i++) {
			int tm = Integer.MAX_VALUE;
			for(int j = 0; j < n; j++) {
				if( (i-a[j]) > 0 ) {
					int t = min[i-a[j]] + b[j];
					if(t < tm) {
						tm = t;
					}
				}
			}
			min[i] = tm;
		}

		int ans = Integer.MAX_VALUE;
		for(int i = h; i < h+amax+1; i++) {
			if(min[i] < ans) {
				ans = min[i];
			}
		}

		System.out.println(ans);

	}



}