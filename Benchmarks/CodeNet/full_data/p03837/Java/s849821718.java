import java.util.*;

class Main {

    void solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		int[] a = new int[m], b = new int[m], c = new int[n];
		for(int i = 0; i < m; i++){
			a[i] = in.nextInt() - 1;
			b[i] = in.nextInt() - 1;
			c[i] = in.nextInt();
		}
		int[][] dist = new int[n][n];
		for(int i = 0; i < n; i++){
			Arrays.fill(dist[i], Integer.MAX_VALUE / 3);
			dist[i][i] = 0;
		}
		for(int i = 0; i < m; i++){
			dist[a[i]][b[i]] = Math.min(dist[a[i]][b[i]], c[i]);
			dist[b[i]][a[i]] = Math.min(dist[b[i]][a[i]], c[i]);
		}
		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
		int ans = m;
		for(int k = 0; k < m; k++){
			boolean f = false;
			for(int i = 0; i < n; i++){
				if(dist[i][a[k]] + c[k] == dist[i][b[k]]){
					f = true;
				}
			}
			if(f){
				ans--;
			}
		}
		System.out.println(ans);
	}

    public static void main(String[] args) {
        new Main().solve();
    }
}
