
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		Map<Integer,List<Integer>> child = new HashMap<Integer,List<Integer>>();
		for(int i = 0 ;i < n-1; i++) {
			int k = sc.nextInt();
			int v = sc.nextInt();
			
			child.computeIfAbsent(k, c -> new ArrayList<Integer>()).add(v);
		}
		
		int root = 1;
		
		
		int s[] = new int[n+1];
		for(int i = 0; i < q; i++) {
			s[sc.nextInt()] += sc.nextInt();
		}
		int res[] = new int[n+1];
		dfs(root,s,child,res, 0);
		StringJoiner sj = new StringJoiner(" ");
		for(int x= 1; x <= n; x++) {
			sj.add(res[x]+"");
		}
		System.out.println(sj.toString());
	}
	
	void dfs(int addr, int s[], Map<Integer,List<Integer>> child, int res[], int sum) {
		sum += s[addr];
		res[addr] = sum;
		if(child.containsKey(addr)) {
			for(int next: child.get(addr)) {
				dfs(next, s,child, res, sum);
			}
		}
	}
	
}
