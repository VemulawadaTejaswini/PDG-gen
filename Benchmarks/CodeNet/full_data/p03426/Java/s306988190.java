import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		int[][] p = new int[h*w][2];
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        int a = sc.nextInt() - 1;
		        p[a][0] = i;
		        p[a][1] = j;
		    }
		}
		int q = sc.nextInt();
		int[][] lr = new int[q][2];
		for(int i = 0; i < q; i++){
		    lr[i][0] = sc.nextInt()-1;
		    lr[i][1] = sc.nextInt()-1;
		}
		
		// 計算
		long result = 0;
		int[][] dist = new int[h*w][h*w];
		for(int a = 0; a < h*w; a++){
		    if(a+d < h*w){
		        dist[a][a+d] = abs(p[a][0] - p[a+d][0]) + abs(p[a][1] - p[a+d][1]);
		    }
		}
		
		wf(dist);
		
		// 出力
		for(int i = 0; i < q; i++){
		    System.out.println(dist[lr[i][0]][lr[i][1]]);
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


