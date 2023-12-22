import java.util.*;
public class Main {
	
	public static long max(long[] a) {
		long max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[][] sushi = new int[2][N];
		for(int i = 0; i < N; i++) {
			sushi[0][i] = sc.nextInt();
			sushi[1][i] = sc.nextInt();
		}
		Arrays.sort(sushi, (x,y) -> -(x[1]-y[1]));
		long[] value = new long[N];
		int[] used = new int[N+1];
		long taste = 0;
		for(int i = 0; i < K; i++) {
			taste += sushi[0][i];
			used[sushi[1][i]]++;
		}
		int type = 0;
		for(int i = 0; i <= N; i++)
			if(used[i] > 0)
				type++;
		value[type] = (long)type*type + taste;
		LOOP:for(int i = type; i <= N; i++) {
			for(int j = K-1; j >= 0; j--) {
				if(used[sushi[1][j]] > 1) {
					taste -= sushi[0][j];
					used[sushi[1][j]]--;
				}
				else if(j == 0)
					break LOOP;
			}
		}
		System.out.println(max(value));
	}

}