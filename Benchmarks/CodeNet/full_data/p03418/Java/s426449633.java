import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		int ans = 0;
		
		for(int b = 1; b <= N; b++) {
			int temp = b - K > 0 ? b - K : 0;
			/*for(int a = 1; a <= b; a++) {
				if(a % b >= K) {
					temp++;
				}
			}*/
			ans += (N / b) * temp;
			
			for(int a = 1; a <= N % b; a++) {
				if(a % b >= K) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
