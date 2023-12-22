import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] u = new int[N-1];
		int[] v = new int[N-1];
		int[] w = new int[N-1];
		ArrayList<List<Integer>> edge_1 = new ArrayList<List<Integer>>();
		for (int i=0;i<N;i++) {
			List<Integer> x = new ArrayList<Integer>();
			edge_1.add(x);
		}
		for (int i=0;i<N-1;i++) {
			u[i]=Integer.parseInt(sc.next())-1;
			v[i]=Integer.parseInt(sc.next())-1;
			w[i]=Integer.parseInt(sc.next());
			edge_1.get(u[i]).add(u[i]);
			edge_1.get(u[i]).add(v[i]);
			edge_1.get(u[i]).add(w[i]);
			edge_1.get(v[i]).add(v[i]);
			edge_1.get(v[i]).add(u[i]);
			edge_1.get(v[i]).add(w[i]);
		}
		int[] ans = new int[N];
		Arrays.fill(ans,-1);



		Queue<int[]> queue_1 = new ArrayDeque<int[]>();
		ans[0]=0;
		int M = edge_1.get(0).size();
		for (int i=0;i<M/3;i++) {
			int a_i=edge_1.get(0).get(3*i);
			int b_i=edge_1.get(0).get(3*i+1);
			int c_i=edge_1.get(0).get(3*i+2);
			int d_i=(c_i+ans[a_i])%2;
			if (d_i==0) {
				ans[b_i]=0;
			} else {
				ans[b_i]=1;
			}
			int[] add_init = {a_i,b_i,d_i};
			queue_1.add(add_init);
		}

		while(!queue_1.isEmpty()) {
			int[] rem=queue_1.remove();
			int U_x=rem[0];
			int V_x=rem[1];
			int W_x=rem[2];

			int P = edge_1.get(V_x).size();
			for (int i=0;i<P/3;i++) {
				int a_i=edge_1.get(V_x).get(3*i);
				int b_i=edge_1.get(V_x).get(3*i+1);
				int c_i=edge_1.get(V_x).get(3*i+2);
				int d_i=(c_i+W_x)%2;
				if (ans[b_i]==-1) {
					if (d_i==0) {
						ans[b_i]=0;
					} else {
						ans[b_i]=1;
					}
					int[] add = {a_i,b_i,d_i};
					queue_1.add(add);
				}
			}
		}
		for (int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
}