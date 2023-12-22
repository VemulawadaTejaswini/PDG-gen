import java.util.*;

public class Main {
	static class Node {
		int day=0;
		ArrayList<Node> in  = new ArrayList<>();
		ArrayList<Node> out = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] A = new int[N][N-1];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-1; j++) {
				A[i][j] = sc.nextInt()-1;
			}
		}
		
		Node[][] n = new Node[N][N];
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				n[i][j] = new Node();
				n[j][i] = n[i][j];
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-2; j++) {
				n[i][A[i][j]].out.add(n[i][A[i][j+1]]);
				n[i][A[i][j+1]].in.add(n[i][A[i][j]]);
			}
		}
	
		LinkedList<Node> q = new LinkedList<>();
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				if(n[i][j].in.size()==0) {
					n[i][j].day=1;
					q.add(n[i][j]);
				}
			}
		}
		if(q.isEmpty()) {
			System.out.println(-1);
			sc.close();
			return;
		}
		
		for(int i=0; i<1000000 && q.size()>0; i++) {
			Node cur = q.poll();
			for(Node next : cur.out) {
				next.day = Math.max(next.day, cur.day+1);
				q.add(next);
			}
		}
		
		if(!q.isEmpty()) {
			System.out.println(-1);
			sc.close();
			return;
		}
		
		int ans = 0;
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				ans = Math.max(ans, n[i][j].day);
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
