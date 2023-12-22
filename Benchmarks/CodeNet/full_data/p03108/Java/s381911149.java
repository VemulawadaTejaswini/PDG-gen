import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		for (int i=0;i<M;i++) {
			A[i] = sc.nextInt()-1;
			B[i] = sc.nextInt()-1;
		}

		long[] ans = new long[M];
		ans[M-1] = N*(N-1)/2;
		UnionFind uni = new UnionFind(N);
		for (int i=M-1;i>0;i--) {
			ans[i-1]=ans[i];
			if (uni.root(A[i])!=uni.root(B[i])) {
				long tmp = uni.size(A[i])*uni.size(B[i]);
				ans[i-1]=ans[i-1]-tmp;
				uni.connect(A[i],B[i]);
			}
		}

		for (int i=0;i<M;i++) {
			System.out.println(ans[i]);
		}
	}

	static class UnionFind {
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
}