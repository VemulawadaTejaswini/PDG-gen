import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] lrd = new int[m][3];
		for(int i = 0; i < m; i++){
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    int d =sc.nextInt();
		    if(l < r){
		        lrd[i][0] = l;
		        lrd[i][1] = r;
		        lrd[i][2] = d;
		    }else{
		        lrd[i][0] = r;
		        lrd[i][1] = l;
		        lrd[i][2] = -d;
		    }
		}
		Arrays.sort(lrd, (x, y) -> {
		    int d = x[0] - y[0];
		    if(d != 0) return d;
		    else return x[1] - y[1];
		});

		// 計算
		String result = "Yes";
		int[] dist = new int[n+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		for(int i = 0; i < m; i++){
		    int from = lrd[i][0];
		    int to = lrd[i][1];
		    int d = lrd[i][2];
		    if(dist[from] == Integer.MAX_VALUE && dist[to] == Integer.MAX_VALUE){
		        dist[from] = 0;
		        dist[to] = d;
		    }else if(dist[to] == Integer.MAX_VALUE){
		        dist[to] = dist[from] + d;
		    }else if(dist[from] == Integer.MAX_VALUE){
		        dist[from] = dist[to] - d;
		    }else{
		        if(dist[to] - dist[from] != d) result = "No";
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
