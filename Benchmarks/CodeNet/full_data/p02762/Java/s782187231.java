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
		Map<Integer, HashSet<Integer>> block = new HashMap<>();
		for(int i = 1; i <= N; i++)
		        block.put(i, new HashSet<>());
		for (int i = 1; i <= K; i++) {
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        block.get(a).add(b);
		        block.get(b).add(a);
		}
		int[] fr = new int[N+1];
		for(int i = 1; i <= N; i++) {
			if(fr[i] == 0) {
				HashSet<Integer> f = new HashSet<>();
				HashSet<Integer> us = new HashSet<>();
				us.add(i);
				boolean[] used = new boolean[N+1];
				Queue<Integer> q = new ArrayDeque<>();
				for(int x : edge.get(i)) {
					q.offer(x);
					f.add(x);
					used[x] = true;
				}
				while(q.size() != 0) {
					int y = q.poll();
					for(int x : edge.get(y)) {
						if(!used[x]) {
							q.offer(x);
							f.add(x);
							used[x] = true;
							us.add(x);
						}
					}	
				}
				for(int x : us) {
					fr[x] = f.size();
					for(int y : block.get(x)) {
						if(f.contains(y))
							fr[x]--;
					}
				}
			}
		}
		for(int i = 1; i <= N; i++) {
			ans.append(fr[i]-edge.get(i).size()-1 + " ");
		}
		System.out.println(ans);

	}

}