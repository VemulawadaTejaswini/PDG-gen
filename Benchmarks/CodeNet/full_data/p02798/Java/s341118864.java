import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	int[] A, B;
	int result = 0;

	static class Tuple {
		int count;
		List<Integer> a, b;

		Tuple() {
			this.count = 0;
			this.a = new ArrayList<>();
			this.b = new ArrayList<>();
		}

		boolean checkCond() {
			// aが降順になっていることが条件
			boolean good = true;
			for (int i = 0; i + 1 < a.size(); ++i) {
				if (a.get(i) < a.get(i + 1)) {
					good = false;
					break;
				}
			}
			return good;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		this.N = Integer.parseInt(in.readLine());
		this.A = new int[N];
		this.B = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			B[i] = Integer.parseInt(tokens[i]);
		}
	}

	void swap(int[] a, int[] b, int i) {
		int tempA = a[i];
		int tempB = b[i];
		a[i] = b[i + 1];
		b[i] = a[i + 1];
		a[i + 1] = tempB;
		b[i + 1] = tempA;
	}

	List<Tuple> gen(int[] a, int[] b) {
		if (a.length == 1) {
			Tuple t0 = new Tuple();
			t0.a.add(a[0]);
			t0.b.add(b[0]);
			List<Tuple> list = new ArrayList<>(1);
			list.add(t0);
			return list;
		} else {
			int[] newA = Arrays.copyOf(a, a.length);
			int[] newB = Arrays.copyOf(b, b.length);
			int[] invA = Arrays.copyOf(a, a.length);
			int[] invB = Arrays.copyOf(a, a.length);
			swap(invA, invB, 0);
			List<Tuple> list0 = gen(Arrays.copyOfRange(newA, 1, newA.length), Arrays.copyOfRange(newB, 1, newB.length));
			List<Tuple> list1 = gen(Arrays.copyOfRange(invA, 1, invA.length), Arrays.copyOfRange(invB, 1, invB.length));
			List<Tuple> list = new ArrayList<>(list0.size() + list1.size());
			for (Tuple t : list0) {
				Tuple tuple = new Tuple();
				tuple.a.addAll(t.a);
				tuple.b.addAll(t.b);
				tuple.a.add(newA[0]);
				tuple.b.add(newB[0]);
				tuple.count = t.count;
				list.add(tuple);
			}
			for (Tuple t : list1) {
				Tuple tuple = new Tuple();
				tuple.a.addAll(t.a);
				tuple.b.addAll(t.b);
				tuple.a.add(invA[0]);
				tuple.b.add(invB[0]);
				tuple.count = t.count + 1;
				list.add(tuple);
			}
			return list;
		}
	}

	void calc() {
		List<Tuple> list = gen(A, B);
		list = list.stream().filter(x -> x.checkCond()).collect(Collectors.toList());
		Collections.sort(list, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				return Integer.compare(o1.count, o2.count);
			}
		});
		if (list.size() == 0) {
			result = -1;
		} else {
			result = list.get(0).count;
		}
	}

	void showResult() {
		System.out.println(result);
	}
}