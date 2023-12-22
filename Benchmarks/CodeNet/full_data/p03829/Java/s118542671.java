
import java.util.*;

public class Main {


	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x[] = new int[n];
		for(int i=0; i<n; i++) {
			x[i]=sc.nextInt();
		}
		long ans = 0;
		for(int i=1; i<n; i++) {
			int d=(x[i] - x[i-1])*a;
			if(d>b) {
				ans += b;
			}else {
				ans += d;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
