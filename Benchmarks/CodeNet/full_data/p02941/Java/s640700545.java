import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] A = new long[n];
		long[] B = new long[n];
		for(int i = 0; i < n; i++){
			A[i] = sc.nextInt();
		}
		PriorityQueue<Pair> q = new PriorityQueue<>();
		for(int i = 0; i < n; i++){
			B[i] = sc.nextInt();
			q.add(new Pair(i, B[i]));
		}
		long res = 0;
		while(!q.isEmpty()){
			Pair p = q.remove();
			int u = p.ind;
			if(B[u] == A[u]) continue;
			long sides = B[(u+1)%n] + B[(u+n-1)%n];
			if(sides >= B[u]){
				System.out.println("-1"); return;
			}
			long newb = B[u] % sides;
			if(newb <= A[u]){
				if((A[u] - newb) % sides == 0){
					res += (B[u] - A[u]) / sides;
					B[u] = A[u];
				}
				else{
					System.out.println("-1"); return;
				}
			}
			else{
				res += (B[u] - newb) / sides;
				B[u] = newb;
				q.add(new Pair(u, B[u]));
			}
		}
		System.out.println(res);
	}
	static class Pair implements Comparable<Pair>{
		int ind; long val;
		public Pair(int ind, long val){
			this.ind = ind; this.val = val;
		}
		@Override
		public int compareTo(Pair p) {
			if(val < p.val) return 1;
			else if(val > p.val) return -1;
			else return 0;
		}
		public String toString(){
			return ind+" "+val;
		}
	}

}
