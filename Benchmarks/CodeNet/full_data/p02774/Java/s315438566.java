import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			List<Integer> pos = new ArrayList<>();
			List<Integer> zero = new ArrayList<>();
			List<Integer> neg = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				int temp = sc.nextInt();
				if (temp > 0) {
					pos.add(temp);
				} else if (temp < 0) {
					neg.add(temp);
				} else {
					zero.add(temp);
				}
			}
			int posSize = pos.size();
			int negSize = neg.size();
			int zeroSize = zero.size();
			if (K > posSize * neg.size()) {
				K -= posSize * neg.size();
				int zeroZero = zeroSize * (zeroSize - 1) / 2;
				if (K > (posSize + negSize) * zeroSize + zeroZero) {
					K -= (posSize + negSize) * zeroSize + zeroZero;
					List<Long> lst = new ArrayList<>();
					for (int i = 0; i < posSize; i++) {
						for (int j = i + 1; j < posSize; j++) {
							lst.add((long) pos.get(i) * (long) pos.get(j));
						}
					}
					for (int i = 0; i < negSize; i++) {
						for (int j = i + 1; j < negSize; j++) {
							lst.add((long) neg.get(i) * (long) neg.get(j));
						}
					}
					Collections.sort(lst);
					System.out.print(lst.get(K - 1));
					return;
				} else {
					System.out.print(0);
					return;
				}
			} else {
				List<Long> lst = new ArrayList<>();
				for (int i : pos) {
					for (int j : neg) {
						lst.add((long) i * (long) j);
					}
				}
				Collections.sort(lst);
				System.out.print(lst.get(K - 1));
			}
		}
	}
}