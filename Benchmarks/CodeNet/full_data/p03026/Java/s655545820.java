


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
		for (int i=0;i<n-1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (!graph.containsKey(a)) {
				graph.put(a, new ArrayList<Integer>());
			}
			if (!graph.containsKey(b)) {
				graph.put(b, new ArrayList<Integer>());
			}
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		ArrayList<Integer> c = new ArrayList<>();
		for (int i=0;i<n;i++) {
			c.add(sc.nextInt());
		}
		
		c.sort(Collections.reverseOrder());
		
		int[] counter = new int[1];
		HashMap<Integer, Integer> num = new HashMap<>();
		dfs(graph, num, 1, counter);
		
		long sum = 0;
		for (int i=1;i<n;i++) {
			sum+=c.get(i);
		}
		
		System.out.println(sum);
		StringBuffer str = new StringBuffer();
		for (int i=1; i<=n; i++) {
			str.append(c.get(num.get(i)));
			if (i<n) {
				str.append(" ");
			}
		}
		System.out.println(str);
	}
	
	static void dfs (HashMap<Integer, ArrayList<Integer>> graph, HashMap<Integer, Integer> num, int k, int[] counter) {
		if (!num.containsKey(k)) {
			num.put(k, counter[0]);
			counter[0]++;
			for (Integer intg : graph.get(k)) {
				dfs(graph, num, intg, counter);
			}
		}

	}
}




