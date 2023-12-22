
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
		int X=sc.nextInt();
		int x[] = new int[n+1];
		for(int i=0; i<n; i++) {
			x[i]=sc.nextInt();
		}
		x[n]=X;

		Arrays.sort(x);

		int sub[] = new int[n];
		for(int i=1; i<=n; i++) {
			sub[i-1]=x[i] - x[i-1];
		}

		Arrays.sort(sub);

		for(int i=0; i<n; i++) {
			int ans = sub[i];
			int j=0;
			for(j=0; j<n; j++) {
				if(sub[j]%ans != 0) {
					break;
				}
			}
			if(j==n) {
				System.out.println(ans);
				sc.close();
				return;
			}
		}
		sc.close();
	}

}
