import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Solver solver = new Solver(System.in, out);
        solver.solve();
        out.close();
    }
}
class Solver {
	Scanner sc;
	PrintWriter out;
    public Solver(InputStream in, PrintWriter out) {
    	sc = new Scanner(in);
    	this.out = out;
    }
    // ==================================================================
    // 単純な素因数分解								
    Map<Long, Long> dec(long n){								
    	// 割った数を保存するマップ　３で２回割れたら、ans.get(3) == 2　となる							
    	Map<Long, Long> ans = new HashMap<Long, Long>();							
            								
    	long num = n;							
    	Long wk = 0L;							
    	// ２　～　ルートｎ　の間、繰り返す							
    	for(long i = 2; i * i <= n && num != 1; ++i){							
    		// i で割り切れる間、割る						
    		while(num % i == 0){						
    			num /= i;					
    			wk = ans.get(i);					
    			if(wk == null) {					
    				ans.put(i, 1L);				
    			} else {					
    				ans.replace(i, (wk+1L));				
    			}					
    		}						
    	}							
    	if(num != 1) {							
    		wk = ans.get(num);// 最後に残った数も含める						
    		if(wk == null) {						
    			ans.put(num, 1L);					
    		} else {						
    			ans.replace(num, (wk+1L));					
    		}						
    	}							
    	return ans;							
    }
    int MAX = 510000;					
    int MOD = 1000000007;					
    long[] fac, finv, inv;			// a! (fac[a])   (a!)の-1乗 (finv[a])		
    // テーブルを作る前処理　→　これを呼んでから COM() を呼ぶ					
    void COMinit() {					
    	fac = new long[MAX];				
    	finv = new long[MAX];				
    	inv = new long[MAX];				
    	fac[0] = fac[1] = 1;				
    	finv[0] = finv[1] = 1;				
    	inv[1] = 1;				
    	for (int i = 2; i < MAX; i++){				
        		fac[i] = fac[i - 1] * i % MOD;			
    		inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;			
    		finv[i] = finv[i - 1] * inv[i] % MOD;			
    	}				
    }					
    // 二項係数計算					
    long COM(int n, int k){					
    	if (n < k)		return 0;		
    	if (n < 0 || k < 0)		return 0;		
    	return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;				
    }					
    public void solve() {
    	int N = Integer.parseInt(sc.next());
    	int M = Integer.parseInt(sc.next());
    	Map<Long, Long> D = dec(M);
    	long ans = 1;
    	COMinit();
    	for(long key : D.keySet()) {
    		long val = D.get(key);
    		ans = (ans * COM((int)val + N - 1, N - 1)) % MOD;
    	}
    	out.println(ans);
    }
}
