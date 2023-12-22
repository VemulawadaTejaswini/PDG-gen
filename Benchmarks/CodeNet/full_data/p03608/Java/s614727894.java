import java.util.*;

public class Main {
	static long dist[][];
	static int ary[][];
	static int perm_cnt;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		int r[] = new int[R];
		
		int ary_len = 1;
		String perm_str = "";
		for(int i = 0; i < R; i++) {
			r[i] = sc.nextInt() - 1;
			ary_len *= (i + 1);
			perm_str += r[i];
		}
		ary = new int[ary_len][R];
		permutation(perm_str, "");
		
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
		
		WarshallFloyd(N);
		
		int temp[] = new int[ary_len];
		int ans = Integer.MAX_VALUE;
		for(int a = 0; a < ary_len; a++) {
			for(int i = 0; i < R - 1; i++) {
				temp[a] += dist[ary[a][i]][ary[a][i + 1]];
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
	
	public static void permutation(String q, String ans){
		if(q.length() <= 1) {
			String str = ans + q;
			for(int i = 0; i < ary[0].length; i++) {
				ary[perm_cnt][i] = Integer.parseInt(str.substring(i, i + 1));
			}
			perm_cnt++;
	    } else {
	    	for (int i = 0; i < q.length(); i++) {
	    		permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
	        }
	    }
	}
}
