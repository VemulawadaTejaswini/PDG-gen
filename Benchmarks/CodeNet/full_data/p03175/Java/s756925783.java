
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
		
		int[] ans = search(tree,1,0);
		
		System.out.println((ans[0]+ans[1]) % mod);
		
	}
	
	Map<Integer,int[]> memo = new HashMap<Integer,int[]>();
	int[] search(Map<Integer,List<Integer>> tree, int now, int prev){
		if(memo.containsKey(now)){
			return memo.get(now);
		}
		
		int[] res = new int[2];
		
		int zero = 1;
		int all = 1;
		
		
		for(int next: tree.getOrDefault(now,new ArrayList<Integer>())){
			if(next != prev){
				int[] nv = search(tree,next,now);
				
				zero = prod(zero, nv[0]);
				all = prod(all,nv[0] + nv[1]);
			}
		}
		
		res[0] = all;
		res[1] = zero;

		memo.put(now, res);
		return res;
	}
	
	int mod = 1000000007;
	int prod(int a, int b){
		return (int)(((long)((long)a % mod )* ((long)b % mod)) % mod);
	}
	
}
