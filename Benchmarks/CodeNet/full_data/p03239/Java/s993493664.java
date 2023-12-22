import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		
		int c[] = new int[N];
		int t[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}
		
		int ans = 2000;
		boolean ansExists = false;
		
		for (int i = 0; i < N; i++) {
			
			if (t[i] <= T) {
				ans = c[i];
				ansExists = true;
				break;
			}
		}
		
		if (ansExists == false) {
			System.out.println("TLE");
			return;
		}
		
       for (int i = 0; i < N; i++) {
			
			if (t[i] <= T && c[i] < ans) {
				ans = c[i];
			}
		}
       
       System.out.println(ans);
	}
}