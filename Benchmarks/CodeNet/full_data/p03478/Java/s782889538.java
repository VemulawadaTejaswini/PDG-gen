import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0; 
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			sum = i/10000 + i%10000/1000 + i%1000/100 + i%100/10 + i%10;
			if(sum>=A && sum<=B) {
				ans += i;
//				debug(i);
//				debug(sum);
			}
			sum = 0;
		}
		System.out.println(ans);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}