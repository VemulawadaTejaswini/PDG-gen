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
		int x[] = new int[n];
		int sum[] = new int[n+1];
		for(int i=0; i<n; i++) {
			x[i]=sc.nextInt();
			sum[i+1]=sum[i]+x[i];
		}
		long ans = Long.MAX_VALUE;
		for(int i=0; i<n-k+1; i++) {
			int r = Math.abs(x[i+k-1]-x[i]);
			int cnt = Math.min(Math.abs(x[i])+r, Math.abs(x[i+k-1])+r);
			ans = Math.min(ans, cnt);
		}
		System.out.println(ans);
		sc.close();
	}

}
