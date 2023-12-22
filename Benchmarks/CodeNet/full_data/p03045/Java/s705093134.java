import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] X = new int[M];
		int[] Y = new int[M];
		int[] Z = new int[M];
		for (int i=0;i<M;i++) {
			X[i]=sc.nextInt();
			Y[i]=sc.nextInt();
			Z[i]=sc.nextInt();
		}
		UnionFind uni = new UnionFind(N);
		for (int i=0;i<M;i++) {
			uni.connect(X[i]-1,Y[i]-1);
		}
		int ans=0;
		for (int i=0;i<N;i++) {
			if (uni.Parent.get(i)<0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}

class UnionFind {
	List<Integer> Parent;
	UnionFind(int N) {
		Parent = new ArrayList<Integer>();
		Integer[] values = new Integer[N];
		Arrays.fill(values, -1);
		Parent.addAll(Arrays.asList(values));
	}
	int root(int A) {
		if (Parent.get(A) < 0)
			return A;
		int root = root(Parent.get(A));
		Parent.set(A, root);
		return root;
	}
	int size(int A) {
		return -Parent.get(root(A));
	}

	boolean connect(int A, int B) {
		A = root(A);
		B = root(B);
		if (A == B) {
			return false;
		}

		if (size(A) < size(B)) {
			int temp = A;
			A = B;
			B = temp;
		}

		Parent.set(A, Parent.get(A) + Parent.get(B));
		Parent.set(B, A);

		return true;
	}
}