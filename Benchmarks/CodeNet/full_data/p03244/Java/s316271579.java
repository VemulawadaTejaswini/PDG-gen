import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v1[] = new int[n / 2];
		int v2[] = new int[n / 2];
		for (int i = 0; i < n / 2; i++) {
			v1[i] = sc.nextInt();
			v2[i] = sc.nextInt();
		}

		Arrays.sort(v1);
		Arrays.sort(v2);
		int p = 1;
		for (int i = 0; i < (n / 2) - 1; i++) {
			if (v1[i] != v1[i + 1]) {
				p++;
			}
		}
		int x1[] = new int[p];
		p = 1;
		for (int i = 0; i < (n / 2) - 1; i++) {
			if (v2[i] != v2[i + 1]) {
				p++;
			}
		}
		int x2[] = new int[p];
		Renzoku(v1, x1);
		Renzoku(v2, x2);

		Arrays.sort(x1);
		Arrays.sort(x2);
		int ans=n-x1[x1.length-1]-x2[x2.length-1];

		if(ans==0&&v1[0]==v2[0]){
		System.out.println(n/2);
		}else if(mode(v1)==mode(v2)){
			System.out.println(Math.min(n-x1[x1.length-2]-x2[x2.length-1],n-x1[x1.length-1]-x2[x2.length-2]));
		}else{

		System.out.println(ans);
	}}

	public static int mode(int x[]) {
		int mode = 0;
		Arrays.sort(x);
		int p = 1;
		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] != x[i + 1]) {
				p++;
			}
		}
		int x1[] = new int[p];
		Renzoku(x, x1);
		int x1max = haimax(x1);
		int x1maxnum = 0;
		for (int i = 0; i < x1.length; i++) {
			if (x1[i] == x1max) {
				x1maxnum = i;
			}
		}
		p = 0;
		mode = x[0];
		for (int i = 0; i < x.length - 1; i++) {

			if (x[i] != x[i + 1]) {
				p++;
			}
			if (p == x1maxnum) {
				mode = x[i + 1];
				break;
			}
		}
		return mode;
	}

	public static int Renzoku(int c[], int x[]) {

		int mode = 0;
		int val = 0;

		for (int i = 0; i <= c.length - 2; i++) {
			if ((c[i] == c[i + 1]) && i != c.length - 2) {
				val++;
			} else {
				if ((c[i] == c[i + 1]) && i == c.length - 2) {
					val++;
				}
				val++;
				x[mode] = val;
				mode++;

				if ((c[i] != c[i + 1]) && i == c.length - 2) {
					x[mode] = 1;
					mode++;
				}

				val = 0;
			}

		}
		return mode;

	}

	public static int haimax(int a[]) {
		int d;
		d = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (d <= a[i]) {
				d = a[i];
			}

		}
		return d;
	}


}
