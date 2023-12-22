import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static class Separate {
		public int a, b;

		public Separate(String[] tokens) {
			a = Integer.parseInt(tokens[0]) - 1;
			b = Integer.parseInt(tokens[1]) - 1;
		}
	}

	int islandNum, bridgeNum;
	boolean[] bridgeState;
	int removeCount;

	public Main(int islandNum, int bridgeNum) {
		this.islandNum = islandNum;
		this.bridgeNum = bridgeNum;
		this.bridgeState = new boolean[bridgeNum];
		Arrays.fill(this.bridgeState, true);
	}

	public void eval(List<Separate> list) {
		for (int i = 0; i < list.size(); ++i) {
			eval(list.get(i));
		}
	}

	private void eval(Separate sep) {
		boolean sepCheck = false;
		for (int i = sep.a; i < sep.b; ++i) {
			if (!bridgeState[i]) {
				sepCheck = true;
				break;
			}
		}
		if (sepCheck) {
			return;
		}
		bridgeState[sep.b - 1] = false;
		removeCount++;
		return;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		boolean[] bridges = new boolean[N - 1];
		Arrays.fill(bridges, true);

		List<Separate> list = new ArrayList<>();
		for (int i = 0; i < M; ++i) {
			tokens = in.nextLine().split(" ");
			list.add(new Separate(tokens));
		}
		list.sort(new Comparator<Separate>() {
			@Override
			public int compare(Separate o1, Separate o2) {
				if (o1.b < o2.b) {
					return -1;
				} else if (o1.b > o2.b) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		Main ins = new Main(N, N - 1);
		ins.eval(list);
		System.out.println(ins.removeCount);
		in.close();
	}
}