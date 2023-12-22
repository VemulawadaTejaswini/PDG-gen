import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] P = new int[N];
		for(int i=0; i<N; i++) {
			P[i] = sc.nextInt();
		}
		
		int min = N;
		int ans = 0;
		for(int i=0; i<N; i++) {
			if(P[i]<=min) {
				ans ++;
				min = P[i];
			}
		}

		System.out.println(ans);
		sc.close();
	}
}
