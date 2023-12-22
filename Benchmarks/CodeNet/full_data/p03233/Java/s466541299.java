import java.util.*;

public class Main {
	int N;
	List<Integer> A = new ArrayList<>();
	List<Integer> B = new ArrayList<>();
	int result = 0;

	private static class Elem {
		int index, val;

		private Elem(int index, int val) {
			this.index = index;
			this.val = val;
		}
	}

	private Main() {
		Scanner in = new Scanner(System.in);
		N = Integer.parseInt(in.nextLine());
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.nextLine().split(" ");
			A.add(Integer.parseInt(tokens[0]));
			B.add(Integer.parseInt(tokens[1]));
		}
		in.close();
	}

	private void calc() {
		List<Elem> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			a.add(new Elem(i, A.get(i)));
		}
		b.addAll(B);
		Collections.sort(a, new Comparator<Elem>() {
			@Override
			public int compare(Elem o1, Elem o2) {
				if (o1.val < o2.val) {
					return -1;
				} else if (o1.val > o2.val) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		Collections.sort(b, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		for (int i = 0; i < N; ++i) {
			int aVal = a.get(i).val;
			if (b.size() == 1) {
				int bVal = b.get(0);
				result += Math.min(aVal, bVal);
			} else {
				int index = 0;
				if (b.get(index) == B.get((a.get(i).index))) {
					index++;
				}
				int bVal = b.get(index);
				result += Math.min(aVal, bVal);
				b.remove(index);
			}
		}
	}

	private void show() {
		System.out.println(result);
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();
	}

}