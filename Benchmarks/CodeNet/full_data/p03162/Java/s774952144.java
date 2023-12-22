import java.util.*;

public class Main {
	int N;
	List<Integer> a, b, c;
	long[] happies;
	int prevPlay;

	Main(int firstPlay) {
		Scanner in = new Scanner(System.in);
		N = Integer.parseInt(in.nextLine());
		a = new ArrayList<>(N);
		b = new ArrayList<>(N);
		c = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.nextLine().split(" ");
			a.add(Integer.parseInt(tokens[0]));
			b.add(Integer.parseInt(tokens[1]));
			c.add(Integer.parseInt(tokens[2]));
		}
		in.close();
		happies = new long[N];
		prevPlay = firstPlay;
		switch (firstPlay) {
		default:
		case 0:
			happies[0] = a.get(0);
			break;
		case 1:
			happies[0] = b.get(0);
			break;
		case 2:
			happies[0] = c.get(0);
			break;
		}
	}

	Main(Main ins, int firstPlay) {
		N = ins.N;
		a = new ArrayList<>(N);
		b = new ArrayList<>(N);
		c = new ArrayList<>(N);
		a.addAll(ins.a);
		b.addAll(ins.b);
		c.addAll(ins.c);
		happies = new long[N];
		prevPlay = firstPlay;
		switch (firstPlay) {
		default:
		case 0:
			happies[0] = a.get(0);
			break;
		case 1:
			happies[0] = b.get(0);
			break;
		case 2:
			happies[0] = c.get(0);
			break;
		}

	}

	long getResult() {
		return happies[N - 1];
	}

	void calc() {
		for (int i = 1; i < N; ++i) {
			int maxHappy = Integer.MIN_VALUE;
			int currentPlay = -1;
			if (prevPlay != 0) {
				// aを評価
				if (maxHappy < a.get(i)) {
					maxHappy = a.get(i);
					currentPlay = 0;
				}
			}
			if (prevPlay != 1) {
				// bを評価
				if (maxHappy < b.get(i)) {
					maxHappy = b.get(i);
					currentPlay = 1;
				}
			}
			if (prevPlay != 2) {
				// cを評価
				if (maxHappy < c.get(i)) {
					maxHappy = c.get(i);
					currentPlay = 2;
				}
			}
			happies[i] = maxHappy + happies[i - 1];
			prevPlay = currentPlay;
		}
	}

	public static void main(String[] args) {
		Main ins0 = new Main(0);
		ins0.calc();
		Main ins1 = new Main(ins0, 1);
		ins1.calc();
		Main ins2 = new Main(ins0, 2);
		ins2.calc();
		long result = Math.max(ins0.getResult(), Math.max(ins1.getResult(), ins2.getResult()));
		System.out.println(result);
	}

}