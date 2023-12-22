import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solver solver = new Solver(sc);
		solver.solve();
	}
}

class Solver {

	private int N;
	private HashMap<Integer, Integer> map = new HashMap<>();;
	private int X;
	private int Y;

	Solver(Scanner sc) {
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			if (!map.containsKey(ai)) {
				map.put(ai, 1);
			} else {
				map.put(ai, map.get(ai) + 1);
			}
		}
	}

	void solve() {
		Object[] keys = map.keySet().toArray();
		Arrays.sort(keys);

		for (int i = keys.length - 1; i >= 0; i--) {
			int key = (int)keys[i];
			int count = map.get(key);

			if (count < 2) {
				continue;
			}

			if (X == 0) {
				X = key;
				if (count >= 4) {
					Y = key;
				}
			}
			else{
				Y = key;
			}

			if(X > 0 && Y > 0){
				break;
			}
		}

		System.out.println(X*Y);
	}
}
