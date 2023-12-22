import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] dist = new int[n+1][n+1];
		for(int i = 0; i < m; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    dist[a][b] = c;
		    dist[b][a] = c;
		}
		int q = sc.nextInt();
		int[][] st = new int[q][2];
		for(int i = 0; i < q; i++){
		    st[i][0] = sc.nextInt();
		    st[i][1] = sc.nextInt();
		}

		// 計算
	    wf(dist);
	    int[][] dist2 = new int[n+1][n+1];
	    for(int i = 0; i < n+1; i++){
	        for(int j = 0; j < n+1; j++){
	            if(dist[i][j] <= l){
	                dist2[i][j] = 1;
	            }
	        }
	    }
	    wf(dist2);

		// 出力
		for(int i = 0; i < q; i++){
		    int result = -1;
		    if(dist2[st[i][0]][st[i][1]] != 1001001001) result = dist2[st[i][0]][st[i][1]] - 1;
		    System.out.println(result);
		}
        
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
