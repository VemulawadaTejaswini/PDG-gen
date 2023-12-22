import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int A[] = new int[20];
	int x[][] = new int[20][20];
	int y[][] = new int[20][20];
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			A[i] = sc.nextInt();
			for(int j=1; j<=A[i]; j++) {
				x[i][j] = sc.nextInt();
				y[i][j] = sc.nextInt();
			}
		}
		int ans = 0;
		for(int bits=1; bits<(1<<n); bits++) {
			boolean ok = true;
			for(int i=1; i<=n; i++) {
				if(((bits>>i-1) & 1) != 1) {
					continue;
				}
				for(int j=1; j<=A[i]; j++) {
					if((((bits>>x[i][j]-1) & 1) ^ y[i][j])==1) {
						ok=false;
					}
				}
			}
			if(ok) {
				ans = Math.max(ans, counter(bits));
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private int counter(int x) {
		if(x==0) return 0;
		int ans = counter(x>>1) + (x & 1);
		return ans;
	}
}