import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] u = new int[N-1];
		int[] v = new int[N-1];
		int[] w = new int[N-1];
		int[] len = new int[N+1];
		int INF = 1_000_000_001;
		Arrays.fill(len, INF);
		for(int i = 0; i < N-1; i++) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		len[u[0]] = 0;
		while(true) {
			boolean ok = false;
			for(int i = 0; i < N-1; i++) {
				len[v[i]] = Math.min(len[v[i]], len[u[i]] + w[i]);
				len[u[i]] = Math.min(len[u[i]], len[v[i]] + w[i]);
				if(len[v[i]] == INF)
					ok = true;
			}
			if(!ok)
				break;
		}
		for(int i = 1; i <= N; i++) {
			if(len[i] % 2 == 0)
				System.out.println(0);
			else
				System.out.println(1);
		}
	}

}