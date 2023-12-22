import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
    static int n;
    static int m;
    static int p;
    static int[][] e = new int[2500 + 1][2500 + 1];
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		n = sc.nextInt();
		m = sc.nextInt();
		p = sc.nextInt();
		for(int i = 0; i < m; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    e[a][b] = c; // a → b : c枚
		}
		
		// 計算
		int[] visited = new int[n + 1];
		int result = func(1, visited, 0);
		
		// 出力
		System.out.println(result);
		
	}
	
	static int func(int a, int[] visited, int score){
	    int max_score = -1;
	    if(a == n) max_score = max(0, score);
	    for(int i = 1; i < e[0].length; i++){
	        if(e[a][i] == 0) continue;
	        if(visited[i] != 0){
	            return -1;
	        }
	        visited[i] = score + e[a][i] - p;
	        int[] new_visited = Arrays.copyOf(visited, n + 1);
	        max_score = max(max_score, func(i, new_visited, visited[i]));
	    }
	    return max_score;
	}
	
}
