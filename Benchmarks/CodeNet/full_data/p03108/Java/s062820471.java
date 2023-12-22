import java.util.*;

public class Main {
	
	public static class Edge {
		
		int A;
		int B;
		
		public Edge(int A, int B) {
			this.A = A;
			this.B = B;
		}
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		@SuppressWarnings("unchecked") LinkedList<Integer>[] edges = new LinkedList[N];
		long[] convenienceValue = new long[N];
		Edge[] edgeList = new Edge[M];
		long cumulativeInconvenience = 0;
		
		for (int i = 0; i < N; i++) {
			edges[i] = new LinkedList<Integer>();
			convenienceValue[i] = N-1;
		}
		
		for (int i = 0; i < M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			edges[A-1].add(B);
			edges[B-1].add(A);
			edgeList[i] = new Edge(A, B);
		}
		
		for (int i = 0; i < M; i++) {
			Edge e = edgeList[i];
			edges[e.A-1].remove(new Integer(e.B));
			edges[e.B-1].remove(new Integer(e.A));
			for (int j = 0; j < N; j++) {
				boolean[] visitedIslands = new boolean[N];
				Stack<Integer> st = new Stack<Integer>();
				int visitedCount = 0;
				st.push(j);
				while (!st.isEmpty()) {
					int currentIsland = st.pop();
					for (int island : edges[currentIsland]) {
						if (!visitedIslands[island-1] && island-1 != j) {
							visitedIslands[island-1] = true;
							visitedCount += 1;
							st.push(island-1);
						}
					}
				}
				if (visitedCount < convenienceValue[j]) {
					//System.out.println("For edge: " + (j+1) + ", visited: " + visitedCount);
					cumulativeInconvenience += convenienceValue[j] - visitedCount;
					//System.out.println("Convenience val: " + cumulativeInconvenience);
					convenienceValue[j] = visitedCount;
				}
			}
			
			System.out.println(cumulativeInconvenience/2);
		}
    }
  
}
