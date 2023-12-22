import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] edge = new int[m][2];
		for(int i = 0; i < m; i++){
		    edge[i][0] = sc.nextInt()-1;
		    edge[i][1] = sc.nextInt()-1;
		}
		
		// 計算
		int result = 0;
		for(int i = 0; i < m; i++){
		    int[][] dist = new int[n][n];
		    for(int j = 0; j < m; j++){
		        if(i == j) continue;
		        int a = edge[j][0];
		        int b = edge[j][1];
		        dist[a][b] = 1;
		        dist[b][a] = 1;
		    }
		    wf(dist);
		    if(dist[edge[i][0]][edge[i][1]] == 1001001001) result++;
		}
		
		
		// 出力
		System.out.println(result);
	}

	static void wf(int[][] dist) {
		int n = dist[0].length;
		int INF = 1001001001;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(dist[i][j] == 0) dist[i][j] = INF;
				if(i == j) dist[i][j] = 0;
			}
		}

		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
	}
	
}
