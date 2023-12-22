import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		Map<Integer, HashSet<Integer>> edge = new HashMap<>();
		for(int i = 1; i <= N; i++)
		        edge.put(i, new HashSet<>());
		for (int i = 1; i <= M; i++) {
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        edge.get(a).add(b);
		        edge.get(b).add(a);
		}
		Map<Integer, HashSet<Integer>> tree = new HashMap<>();
		boolean[] fr = new boolean[N+1];
		for(int i = 1; i <= N; i++) {
			if(!fr[i]) {
				HashSet<Integer> us = new HashSet<>();
				us.add(i);
				boolean[] used = new boolean[N+1];
				used[i] = true;
				Queue<Integer> q = new ArrayDeque<>();
				for(int x : edge.get(i)) {
					q.offer(x);
					used[x] = true;
					us.add(x);
				}				
				while(q.size() != 0) {
					int y = q.poll();
					for(int x : edge.get(y)) {
						if(!used[x]) {
							q.offer(x);
							used[x] = true;
							us.add(x);
						}
					}	
				}
				for(int x : us) {
					tree.put(x, new HashSet<>(us));
					fr[x] = true;
				}
			}
		}
		for (int i = 1; i <= K; i++) {
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        tree.get(a).remove(b);
		        tree.get(b).remove(a);
		}
		for(int i = 1; i <= N; i++) {
			ans.append(tree.get(i).size()-edge.get(i).size()-1 + " ");
		}
		System.out.println(ans);

	}

}