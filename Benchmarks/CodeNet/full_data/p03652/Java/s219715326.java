import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] a = new int[N][M];
		for(int i=0; i<N; i++)
			for(int j=0; j<M; j++)
				a[i][j] = sc.nextInt()-1;
		
		int min = N;
		boolean[] held = new boolean[M];
		Arrays.fill(held, true);
		int[] idx = new int[N];
		
		for(int i=0; i<M; i++) {
			int[] cnt = new int[M];
			for(int j=0; j<N; j++) {
				while(!held[a[j][idx[j]]])
					idx[j]++;
				cnt[a[j][idx[j]]]++;
			}
			int max = 0;
			for(int j=1; j<M; j++)
				if(cnt[max]<cnt[j])
					max = j;
			min = Math.min(min, cnt[max]);
			held[max] = false;
		}
		
		System.out.println(min);
		
		sc.close();
	}
}
