import java.util.*;

// ABC 70-D
// https://beta.atcoder.jp/contests/abc070/tasks/abc070_d

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		long[][] map = new long[N][N];
		
		for (int i = 0; i < N - 1; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			int c = in.nextInt();
			
			map[a][b] = c;
			map[b][a] = c;
		}
		int Q = in.nextInt();
		int K = in.nextInt() - 1;
		
		long[] toK = new long[N];
		
		for (int i = 0; i < N; i++) {
			if (i != K) {
				PriorityQueue pq = new PriorityQueue<State>();
				int[] visited = new int[N];
				pq.add(new State(i, 0));
				boolean shouldContinue = true;
				while (shouldContinue && pq.size() > 0) {
					State s = (State) pq.poll();
					visited[s.curr] = 1;
					if (s.curr == K) {
						toK[i] = s.dist;
						shouldContinue = false;
					} else {
						for (int j = 0; j < N; j++) {
							if (map[s.curr][j] != 0 && visited[j] == 0) {
								pq.add(new State(j, s.dist + map[s.curr][j]));
							}
						}
					}
				}
			}			
		}
		
		long[] fromK = new long[N];
		
		for (int i = 0; i < N; i++) {
			if (i != K) {
				PriorityQueue pq = new PriorityQueue<State>();
				pq.add(new State(i, 0));
				int[] visited = new int[N];
				boolean shouldContinue = true;
				while (shouldContinue && pq.size() > 0) {
					State s = (State) pq.poll();
					visited[s.curr] = 1;
					if (s.curr == K) {
						fromK[i] = s.dist;
						shouldContinue = false;
					} else {
						for (int j = 0; j < N; j++) {
							if (map[s.curr][j] > 0 && visited[j] == 0) {
								pq.add(new State(j, s.dist + map[s.curr][j]));
							}
						}
					}
				}
			}
		}
		
		for (int i = 0; i < Q; i++) {
			int start = in.nextInt() - 1;
			int end = in.nextInt() - 1;
			System.out.println(toK[start] + fromK[end]);
		}
	}
	
	public static void print(String name, int[] arr) {
		System.out.println(name);
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}
	
}

class State implements Comparable<State> {
	int curr;
	long dist;
	
	public State(int curr, long dist) {
		this.curr = curr;
		this.dist = dist;
	}

	@Override
	public int compareTo(State o) {
		if (this.dist - o.dist < 0) {
			return -1;
		} else if (this.dist - o.dist > 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	
}