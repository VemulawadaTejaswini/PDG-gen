import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		Long[] v = new Long[N];
		for(int i=0; i<N; i++)
			v[i] = sc.nextLong();
		
		Arrays.sort(v, new Comparator<Long>(){
			public int compare(Long l1, Long l2) {
				return -Long.compare(l1, l2);
			}
		});
		
		double sum = 0;
		for(int i=0; i<A; i++)
			sum += v[i];
		
		System.out.println(sum/A);
		
		int s = N,t = 0;
		for(int i=0; i<N; i++)
			if(v[i]==v[A-1]) {
				s = Math.min(s, i);
				t = Math.max(t, i);
			}
		t++;
		
		long[][] comb = new long[100][100];
		for(int i=0; i<100; i++) {
			comb[i][0] = comb[i][i] = 1;
			for(int j=1; j<i; j++) {
				comb[i][j] = comb[i-1][j] + comb[i-1][j-1];
			}
		}
		
		long ans = 0;
		if(s==0) {
			for(int i=A; i<=Math.min(B, t); i++) {
				long[] dummy = new long[1000000000];
			}
		} else {
			ans = comb[t-s][A-s];
		}
		System.out.println(ans);
		
		sc.close();
	}
}