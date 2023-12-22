


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
		HashMap<Integer, Integer> val = new HashMap<>();
		HashMap<Integer, Integer> ans = new HashMap<>();
		for (int i=1;i<=n;i++) {
			graph.put(i, new ArrayList<Integer>());
			val.put(i, 0);
		}
		
		for (int i=0;i<n-1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		for (int i=0;i<q;i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			val.put(p,val.get(p)+x);
		}
		dfs (graph, val, ans, 1, 0);
		
		String[] str = new String[n];
		for (int i=0;i<n;i++) {
			str[i]=ans.get(i+1).toString();
		}
		System.out.println(String.join(" ", str));
		
	}
	
	static void dfs (HashMap<Integer, ArrayList<Integer>> graph, HashMap<Integer, Integer> val,
			HashMap<Integer, Integer> ans, int pos, int tmpVal) {
		tmpVal += val.get(pos);
		ans.put(pos, tmpVal);
		for (Integer intg : graph.get(pos)) {
			if (!ans.containsKey(intg)) {
				dfs (graph, val, ans, intg, tmpVal);
			}
		}
	}
	
}





