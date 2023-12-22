
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long a[] = new long[n];
		long p[] = new long[n*(n-1)/2];
		for(int i=0; i<(n*(n-1)/2); i++) {
			p[i]=Long.MAX_VALUE;
		}
		for(int i=0; i<n; i++) {
			a[i]=sc.nextLong();
		}

		int cnt = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				p[cnt++] = a[i]*a[j];
			}
		}
		Arrays.sort(p);
		System.out.println(p[k-1]);
		sc.close();
	}
}
