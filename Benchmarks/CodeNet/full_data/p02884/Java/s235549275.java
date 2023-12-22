import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    static boolean possible = true;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] edge = new int[m][2];
		for(int i = 0; i < m; i++){
		    edge[i][0] = sc.nextInt();
		    edge[i][1] = sc.nextInt();
		    
		}
		
		// 計算
		double result = Double.MAX_VALUE;
		for(int k = 0; k < m; k++){
		    ArrayList<Integer>[] list = new ArrayList[n+1];
		    for(int i = 1; i <= n; i++){
		        list[i] = new ArrayList<Integer>();
		    }
		    for(int i = 0; i < m; i++){
		        if(i == k) continue;
		        int s = edge[i][0];
		        int t = edge[i][1];
		        list[s].add(t);
		    }
		    double res = calc(list, 1, n, 1, 0);
		    if(possible) result = min(result, res);
		    possible = true;
		}
		if(result == Double.MAX_VALUE){
		    ArrayList<Integer>[] list = new ArrayList[n+1];
		    for(int i = 1; i <= n; i++){
		        list[i] = new ArrayList<Integer>();
		    }
		    for(int i = 0; i < m; i++){
		        int s = edge[i][0];
		        int t = edge[i][1];
		        list[s].add(t);
		    }
		    double res = calc(list, 1, n, 1, 0);
		    result = min(result, res);
		}
		

		// 出力
		System.out.println(result);
		
	}
	
	static double calc(ArrayList<Integer>[] list, int s, int g, double p, int r){
	    if(s == g) return p*r;
	    double q = (double)1/list[s].size();
	    double res = 0;
	    for(int i : list[s]){
	        res += calc(list, i, g, p*q, r+1);
	    }
	    if(res == 0) possible = false;
	    return res;
	}
}