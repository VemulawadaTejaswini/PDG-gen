import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mod = 1_000_000_007;
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<N;i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			edge.add(list);
		}
		for (int i=0;i<N-1;i++) {
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			edge.get(a).add(b);
			edge.get(b).add(a);
		}
		int flag[] = new int[N];
		long ans = 1L;
		LinkedList<Integer> dfs = new LinkedList<Integer>();
		dfs.add(0);
		dfs.add(0);
		flag[0] = 1;
		ans *= K;

		while (dfs.size()>0) {
			Integer i = dfs.remove(0);
			Integer depth = dfs.remove(0);
			int j;
			if (depth==0) {
				j = -1;
			} else {
				j = 0;
			}
			for (Integer element : edge.get(i)) {
				if (flag[element] == 1) {
					continue;
				} else {
					flag[element] = 1;
					ans = ans * (K-2-j) % mod;
					j++;
					for (Integer element_2 : edge.get(element)) {
						if (flag[element_2] == 0) {
							dfs.add(element);
							dfs.add(depth+1);
							break;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
