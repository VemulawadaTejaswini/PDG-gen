import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) a[i] = sc.nextInt();
		sc.close();

		int ans = 1, val = k-1;
		while(k < n) {
			k += val;
			ans++;
		}
		System.out.println(ans);
	}
	
}