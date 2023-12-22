import java.util.*;

public class Main {
	private static class Keiro {
		public int c, t;

		public Keiro(String[] tokens) {
			this.c = Integer.parseInt(tokens[0]);
			this.t = Integer.parseInt(tokens[1]);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int T = Integer.parseInt(tokens[1]);
		List<Keiro> keiros = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			tokens = in.nextLine().split(" ");
			keiros.add(new Keiro(tokens));
		}
		Collections.sort(keiros, new Comparator<Keiro>() {
			@Override
			public int compare(Keiro o1, Keiro o2) {
				if (o1.c < o2.c) {
					return -1;
				} else if (o1.c > o2.c) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		int cost = -1;
		for (int i = 0; i < N; ++i) {
			Keiro keiro = keiros.get(i);
			if (keiro.t <= T) {
				cost = keiro.c;
				break;
			}
		}
		if (cost < 0) {
			System.out.println("TLE");
		} else {
			System.out.println(cost);
		}

		in.close();
	}
}