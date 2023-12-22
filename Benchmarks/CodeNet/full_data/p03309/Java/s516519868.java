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
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			a[i] -= i+1;
		}
		Arrays.sort(a);
		int b=-1;
		if(n%2==1) {
			b=a[n/2];
		}else {
			b=(a[n/2-1]+a[n/2])/2;
		}

		int ans = 0;
		for(int i=0; i<n; i++) {
			ans += Math.abs(a[i]-b);
		}
		System.out.println(ans);
		sc.close();
	}


}
