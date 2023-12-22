import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] P = new int[N];
		for(int i = 0; i < N; i++)
			P[i] = sc.nextInt();
		int ans = N-K+1;
		int nochange = 0, x = 1;
		for(int i = 1; i < N; i++) {
			if(P[i] > P[i-1]) {
				x++;
				if(i == N-1)
					if(x >= K)
						nochange++;
			}
			else {
				if(x >= K)
					nochange++;
				x = 1;
			}
		}
		if(nochange > 0)
			ans = ans - nochange + 1;
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i = 0; i < K; i++)
			ts.add(P[i]);
		for(int i = 0; i < N-K; i++) {
			if(ts.first() == P[i] && P[i+K] > ts.last())
				ans--;
			ts.remove(P[i]);
			ts.add(P[i+K]);
		}
		System.out.println(ans);

	}

}