import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[][] flag = new int[N][3];
		ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<N;i++) {
			ArrayList<Integer> add = new ArrayList<Integer>();
			edge.add(add);
		}
		for (int i=0;i<M;i++) {
			int u = Integer.parseInt(sc.next())-1;
			int v = Integer.parseInt(sc.next())-1;
			edge.get(u).add(v);
		}
		int S = Integer.parseInt(sc.next())-1;
		int T = Integer.parseInt(sc.next())-1;

		ArrayList<Integer> dfs = new ArrayList<Integer>();
		dfs.add(S);
		dfs.add(0);
		dfs.add(0);
		dfs.add(0);

		int ans=-1;
		while (dfs.size()>0) {
			Integer rem = dfs.remove(0);
			Integer index = dfs.remove(0);
			Integer steps = dfs.remove(0);
			Integer before = dfs.remove(0);
			if (rem==T && index==0) {
				System.out.println(steps/3);
				ans=0;
				break;
			}
			if (flag[rem][index]==1) {
				continue;
			} else {
				flag[rem][index]=1;
				for (Integer element : edge.get(rem)) {
					int add_index;
					if (index==2) {
						add_index=0;
					} else {
						add_index=index+1;
					}
					dfs.add(element);
					dfs.add(add_index);
					dfs.add(steps+1);
					dfs.add(rem);
				}
			}
		}
		if (ans==-1) {
			System.out.println(-1);
		}
	}
}import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[][] flag = new int[N][3];
		ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<N;i++) {
			ArrayList<Integer> add = new ArrayList<Integer>();
			edge.add(add);
		}
		for (int i=0;i<M;i++) {
			int u = Integer.parseInt(sc.next())-1;
			int v = Integer.parseInt(sc.next())-1;
			edge.get(u).add(v);
		}
		int S = Integer.parseInt(sc.next())-1;
		int T = Integer.parseInt(sc.next())-1;

		ArrayList<Integer> dfs = new ArrayList<Integer>();
		dfs.add(S);
		dfs.add(0);
		dfs.add(0);
		dfs.add(0);

		int ans=-1;
		while (dfs.size()>0) {
			Integer rem = dfs.remove(0);
			Integer index = dfs.remove(0);
			Integer steps = dfs.remove(0);
			Integer before = dfs.remove(0);
			if (rem==T && index==0) {
				System.out.println(steps/3);
				ans=0;
				break;
			}
			if (flag[rem][index]==1) {
				continue;
			} else {
				flag[rem][index]=1;
				for (Integer element : edge.get(rem)) {
					int add_index;
					if (index==2) {
						add_index=0;
					} else {
						add_index=index+1;
					}
					dfs.add(element);
					dfs.add(add_index);
					dfs.add(steps+1);
					dfs.add(rem);
				}
			}
		}
		if (ans==-1) {
			System.out.println(-1);
		}
	}
}