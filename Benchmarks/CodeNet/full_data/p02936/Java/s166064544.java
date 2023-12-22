import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N, Q;
	long[] v;
	Map<Integer, List<Integer>> tree;
	List<Integer> target, next;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		Q = sc.nextInt();
		v = new long[N];
		
		tree = new HashMap<>();
		for (int i = 0; i < N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			List<Integer> l = tree.get(a);
			if (l == null) l = new ArrayList<>();
			l.add(b);
			tree.put(a, l);
		}
		for (int i = 0; i < Q; i++) v[sc.nextInt()-1] += sc.nextInt();
		
		target = new ArrayList<>();
		next = new ArrayList<>();
		target.add(1);
		while (!target.isEmpty()) {
			next.clear();
			for (int i : target) {
				List<Integer> children = tree.get(i);
				if (children == null) continue;
				for (int child : children) {
					v[child-1] += v[i-1];
					next.add(child);
				}
			}
			List<Integer> tmp = target; target = next; next = tmp;
		}
		System.out.println(Arrays.stream(v).mapToObj(n -> String.valueOf(n)).collect(Collectors.joining(" ")));
		System.out.flush();
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}