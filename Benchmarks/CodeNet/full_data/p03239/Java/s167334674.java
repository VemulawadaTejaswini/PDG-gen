import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		
		int t[] = new int[N];
		int c[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		
		int ans = 222;
		for(int i = 0; i < N; i++) {
			if(t[i] <= T)
				ans = Math.min(ans, c[i]);
		}
		if(ans == 2222)
			System.out.println("TLE");
		else
			System.out.println(ans);

	}

}