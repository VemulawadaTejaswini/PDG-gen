import java.util.*;

class Main {

    void solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		int[] a = new int[m], b = new int[m], c = new int[n];

		int[][] dist = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == j) dist[i][j] = 0;
				else dist[i][j] = (int)1e9;
			}
		}

		for(int i = 0; i < m; i++){
			a[i] = in.nextInt() - 1;
			b[i] = in.nextInt() - 1;
			c[i] = in.nextInt();
			dist[a[i]][b[i]] = dist[b[i]][a[i]] = c[i];
		}

		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
		int ans = 0;
		for(int i = 0; i < m; i++){
			if(c[i] > dist[a[i]][b[i]]) ans++;
		}
		System.out.println(ans);
	}

    public static void main(String[] args) {
        new Main().solve();
    }
}
