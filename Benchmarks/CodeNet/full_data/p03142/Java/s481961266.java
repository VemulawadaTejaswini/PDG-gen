

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;



public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
		for (int i=1;i<=n;i++) {
			graph.put(i, new HashSet<Integer>());
		}

		int[] inOrder = new int[n+1];

		for (int i=0;i<n-1+m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
			inOrder[b]++;
		}

		int root = 0;
		int[] ans = new int[n+1];

		for (int i=1;i<=n;i++) {
			if(inOrder[i]==0) {
				root = i;
				ans[root] = 0;
			}
		}
		bfs (root, graph, inOrder, ans);
		for (int i=1;i<=n;i++) {
			System.out.println(ans[i]);
		}



	}
	static void bfs(int s, HashMap<Integer, HashSet<Integer>> graph, int[] inOrder, int[] ans) {
//		System.out.println("bfs "+s);
		ArrayList<Integer> li = new ArrayList<>();
		for (Integer x :graph.get(s)) {
			inOrder[x]--;
			if (inOrder[x]==0) {
				ans[x]=s;
				li.add(x);
			}
		}
//		System.out.println(li);
		for (Integer y : li) {
			bfs(y,graph,inOrder,ans);
		}
	}



}



