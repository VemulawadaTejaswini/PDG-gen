import java.util.*;

public class Main {
	static long dist[][];
	static int ans_len;
	static int r[];
	static String str[];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		r = new int[R];
		
		int t = 1;
		for(int i = 0; i < R; i++) {
			r[i] = sc.nextInt() - 1;
			t *= (i + 1);
		}
		str = new String[t];
		
		int A[] = new int[M];
		int B[] = new int[M];
		int C[] = new int[M];
		dist = new long[N][N];
		for(int i = 0; i < N; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
			C[i] = sc.nextInt();
			dist[A[i]][B[i]] = C[i];
			dist[B[i]][A[i]] = C[i];
		}
		
		int perm[] = new int[R];
		boolean flag[] = new boolean[R];
		makePerm(0, perm, flag);
		
		WarshallFloyd(N);
		long temp[] = new long[ans_len];
		long ans = Long.MAX_VALUE;
		for(int a = 0; a < ans_len; a++) {
			for(int i = 0; i < R - 1; i++) {
				temp[a] += dist[Integer.parseInt(str[a].substring(i, i + 1))][Integer.parseInt(str[a].substring(i + 1, i + 2))];
			}
			ans = Math.min(ans, temp[a]);
		}
		System.out.println(ans);
	}
	
	static void WarshallFloyd(int N) {
		for(int k = 0; k < N; k++) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
	}
	
	static void makePerm(int n, int perm[], boolean flag[]) {
		if(n == perm.length) {
			boolean ansflag = true;
			str[ans_len] = "";
			for(int i = 0; i < perm.length; i++) {
				str[ans_len] += r[perm[i]];
			}
			if(ansflag) {
				ans_len++;
			}
		} else {
			for(int i = 0; i < perm.length; i++) {
				if(flag[i]) {
					continue;
				} else {
					perm[n] = i;
					flag[i] = true;
					makePerm(n + 1, perm, flag);
					flag[i] = false;
				}
			}
		}
	}
}
