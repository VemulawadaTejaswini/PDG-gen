import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N-1];
		int[] b = new int[N-1];
		Integer[] c = new Integer[N];
		ArrayList<List<Integer>> edge_1 = new ArrayList<List<Integer>>();
		for (int i=0;i<N;i++) {
			List<Integer> x = new ArrayList<Integer>();
			edge_1.add(x);
		}
		for (int i=0;i<N-1;i++) {
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
			if (a[i]>b[i]) {
				int tmp=a[i];
				a[i]=b[i];
				b[i]=tmp;
			}
			edge_1.get(a[i]).add(b[i]);
		}
		int min=0;
		for (int i=0;i<N;i++) {
			c[i]=sc.nextInt();
			min+=c[i];
		}
		Arrays.sort(c,Comparator.reverseOrder());
		min-=c[0];

		int[] ans = new int[N];
		int z = 0;

		//DFS
		Queue<int[]> queue_1 = new ArrayDeque<int[]>();
		int M = edge_1.get(0).size();
		for (int i=0;i<M;i++) {
			int a_i=0;
			int b_i=edge_1.get(0).get(i);
			int[] add_init = {a_i,b_i};
			queue_1.add(add_init);
		}

		while(!queue_1.isEmpty()) {
			int[] rem=queue_1.remove();
			int a_x=rem[0];
			int b_x=rem[1];

			int P = edge_1.get(b_x).size();
			for (int i=0;i<P;i++) {
				int a_i=b_x;
				int b_i=edge_1.get(b_x).get(i);

				int Q = edge_1.get(b_i).size();
				if (Q>=2) {
					ans[b_x]=c[z];
					z++;
					int[] add_array={a_i,b_i};
					queue_1.add(add_array);
				}
			}
		}

		int h=0;
		while (z<N) {
			if (ans[h]==0) {
				ans[h]=c[z];
				z++;
			}
			h++;
		}
		System.out.println(min);
		for (int i=0;i<N;i++) {
			System.out.println(ans[i]);
		}
	}
}