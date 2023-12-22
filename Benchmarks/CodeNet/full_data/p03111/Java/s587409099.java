import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    static int result = Integer.MAX_VALUE;
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] l = new int[n];
		for(int i = 0; i < n; i++){
		    l[i] = sc.nextInt();
		}

		// 計算
		int[] v = new int[n + 1];
		dfs(n, 0, v, a, b, c, l);
		
		// 出力
		System.out.println(result);
        
	}
	static void dfs(int n, int depth, int[] v, int a, int b, int c, int[] l){
	    if(depth == n){
	        //System.out.println(result);
	        result = min(result, calc(n, v, a, b, c, l));
	    }else{
	        for(int i = 0; i < 4; i++){
	            v[depth] = i;
	            dfs(n, depth + 1, v, a, b, c, l);
	        }
	    }
	}
	static int calc(int n, int[] v, int a, int b, int c, int[] l){
	    int mp = 0;
	    // A
	    int lenA = 0;
	    int mixA = 0;
	    for(int i = 0; i < n; i++){
	        if(v[i] == 0){
	            lenA += l[i];
	            mixA++;
	        }
	    }
	    if(lenA == 0) return Integer.MAX_VALUE;
	    mp += abs(a - lenA) + (mixA - 1)*10;
	    // B
	    int lenB = 0;
	    int mixB = 0;
	    for(int i = 0; i < n; i++){
	        if(v[i] == 1){
	            lenB += l[i];
	            mixB++;
	        }
	    }
	    if(lenB == 0) return Integer.MAX_VALUE;
	    mp += abs(b - lenB) + (mixB - 1)*10;
	    // C
	    int lenC = 0;
	    int mixC = 0;
	    for(int i = 0; i < n; i++){
	        if(v[i] == 2){
	            lenC += l[i];
	            mixC++;
	        }
	    }
	    if(lenC == 0) return Integer.MAX_VALUE;
	    mp += abs(c - lenC) + (mixC - 1)*10;
	    
	    return mp;
	}
}
