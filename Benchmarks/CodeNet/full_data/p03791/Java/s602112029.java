import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final long MOD = 1000000007;
		int N = sc.nextInt();
		int[] x = new int[N];
		for(int i=0; i<N; i++)
			x[i] = sc.nextInt();
		
		long ans = 1;
		int num = 0;
		for(int i=0; i<N; i++) {
			if(i<N-1) {
				int next = num*2+1;
				if(next <= x[i])
					num++;
				else
					ans = (ans * (num + 1))%MOD;
			} else {
				for(int j=num+1; j>=1; j--)
					ans = (ans * j)%MOD;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}
