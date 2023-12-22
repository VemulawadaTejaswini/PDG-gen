import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[m];
		int b[] = new int[m];
		int c[] = new int[n-1];
		int d[] = new int[m];

		for(int i=0;i<n-1;i++) {
			c[i] = 0;
		}

		for(int i=0;i<m;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			d[i] = 0;
			for(int j =a[i] - 1;j < b[i]-1;j++) {
				c[j] += 1;
			}
		}

		int t =0;
		int k = 0;
		int sum = 0;

		for(int i=0;i<m;i++) {
			t = 0;
			if(d[i] == 1) {
				continue;
			}
			for(int j=a[i]-1;j<b[i]-1;j++) {
				if(t<=c[j]) {
					t = c[j];
					k = j;
				}
			}
			for(int s=0;s<m;s++) {
				if(d[s] == 1) {
					continue;
				}
				if(a[s] <= k + 1 && k+1<b[s]) {
					d[s] = 1;
				}
			}
			sum += 1;
		}

		System.out.println(sum);

	}
}