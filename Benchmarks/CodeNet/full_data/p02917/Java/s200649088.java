import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int[] b = new int[n-1];
		for(int i = 0; i < n-1; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(i==0) {
				ans += b[i];
			}
			else if(i==n-1) {
				ans+=b[n-2];
			}
			else {
				ans += Math.min(b[i-1], b[i]);
			}
		}
		System.out.println(ans);
	}
}
