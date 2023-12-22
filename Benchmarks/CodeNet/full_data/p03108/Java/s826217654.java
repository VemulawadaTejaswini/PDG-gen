import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
	static class Island {
		int index;
		Island parent;
		Set<Island> members;

		Island(int index) {
			this.index = index;
			this.parent = null;
			this.members = new HashSet<>();
		}

		int getGroupIndex() {
			if (this.parent == null) {
				return index;
			} else {
				return this.parent.getGroupIndex();
			}
		}

		Set<Island> getMembers() {
			if (this.parent == null) {
				return this.members;
			} else {
				return this.parent.getMembers();
			}
		}

		Island getRoot() {
			if (this.parent == null) {
				return this;
			} else {
				return this.parent.getRoot();
			}
		}

		long merge(Island island) {
			Island anotherRoot = island.getRoot();
			Island thisRoot = this.getRoot();
			if (thisRoot.index > anotherRoot.index) {
				return anotherRoot.merge(thisRoot);
			} else if (thisRoot.index == anotherRoot.index) {
				return 0;
			}
			long anoSize = anotherRoot.members.size() + 1;
			long size = thisRoot.members.size() + 1;
			anotherRoot.parent = thisRoot;
			thisRoot.members.add(anotherRoot);
			thisRoot.members.addAll(anotherRoot.members);
			return size * anoSize;
		}
	}

	int N, M;
	int[] A, B;
	Island[] islands;
	Deque<Long> results;

	void calc() {
		this.islands = new Island[N];
		for (int i = 0; i < N; ++i) {
			this.islands[i] = new Island(i);
		}
		this.results = new ConcurrentLinkedDeque<>();
		this.results.addFirst((long) N * (long) (N - 1) / 2);
		for (int i = M - 1; i >= 0; --i) {
			int index = A[i] - 1;
			int anoIndex = B[i] - 1;
			long diff = islands[index].merge(islands[anoIndex]);
			long r = results.getFirst() - diff;
			results.addFirst(r);
		}
		results.pollFirst();
	}

	void show() {
		while (!results.isEmpty()) {
			System.out.println(results.pollFirst());
		}
	}

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		A = new int[M];
		B = new int[M];
		for (int i = 0; i < M; ++i) {
			A[i] = in.nextInt();
			B[i] = in.nextInt();
		}
		in.close();
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();

	}

}
