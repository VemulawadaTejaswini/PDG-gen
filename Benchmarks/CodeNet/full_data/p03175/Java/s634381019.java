
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		
		Map<Integer,List<Integer>> tree = new HashMap<Integer,List<Integer>>();
		
		for(int i = 0 ;i < n-1;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			tree.computeIfAbsent(x, a->new ArrayList<Integer>()).add(y);
			tree.computeIfAbsent(y, a->new ArrayList<Integer>()).add(x);
		}
		
		int[] ans = search(tree,1, new HashSet<Integer>());
		
		System.out.println(ans[0]+ans[1]);
		
	}
	
	Map<Integer,int[]> memo = new HashMap<Integer,int[]>();
	int[] search(Map<Integer,List<Integer>> tree, int now, Set<Integer> set){
		if(memo.containsKey(now)){
			return memo.get(now);
		}
		
		set.add(now);
		
		int[] res = new int[2];
		
		int zero = 1;
		int all = 1;
		
		
		for(int next: tree.get(now)){
			if(!set.contains(next)){
				int[] nv = search(tree,next,set);
				
				zero = prod(zero, nv[0]);
				all = prod(all,nv[0] + nv[1]);
			}
		}
		
		res[0] = all;
		res[1] = zero;

		memo.put(now, res);
		return res;
	}
	
	int mod = 1_000_000_000+7;
	int prod(int a, int b){
		return (int)(((long)(a % mod )* (b % mod)) % mod);
	}
	
}
