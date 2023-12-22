

import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int A = sc.nextInt();
    static int B = sc.nextInt();
    static int C = sc.nextInt();
    static int L [] = new int [N];
    static int INF = 100000000;
    
	public static void main(String[] args) {    
	    for(int i = 0; i < N; i++){
	    	L[i]=sc.nextInt();
	    }
	    sc.close();
	    
	    System.out.println(dfs(0,0,0,0));	    
	}
	
	private static int dfs (int cur, int a, int b, int c){
		int ret0, ret1, ret2, ret3;
		if (cur == L.length) {
            if (a == 0 || b == 0 || c == 0) {
                return INF;
            }
            return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
        }
			ret0 = dfs(cur + 1, a, b, c);
			ret1 = dfs(cur + 1, a + L[cur], b, c) + 10;
			ret2 = dfs(cur + 1, a, b + L[cur], c) + 10;
			ret3 = dfs(cur + 1, a, b, c + L[cur]) + 10;
			
			return Math.min(Math.min(ret0, ret1), Math.min(ret2, ret3));
	}		
}

