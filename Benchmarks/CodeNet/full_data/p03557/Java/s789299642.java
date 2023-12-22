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
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];

		for(int j=0; j<n; j++) {
			a[j]=sc.nextInt();
		}
		for(int j=0; j<n; j++) {
			b[j]=sc.nextInt();
		}
		for(int j=0; j<n; j++) {
			c[j]=sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		int bc[] = new int[n];

		int i=0;
		int j=0;
		while(i<n && j<n) {
			if(b[i]<c[j]) {
				if(i>0) {
					bc[i]=bc[i-1]+n-j;
				} else {
					bc[i]=n-j;
				}
				i++;
			} else {
				j++;
			}
		}

		long cnt=0;
		i=0;
		j=0;
		while(i<n && j<n) {
			if(a[i]<b[j]) {
				if(j>0) {
					cnt += bc[n-1]-bc[j-1];
				} else {
					cnt += bc[n-1];
				}
				i++;
			} else {
				j++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
