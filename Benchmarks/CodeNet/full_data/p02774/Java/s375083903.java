import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			List<Ele> list2 = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				for (int j = i + 1; j < list.size(); j++) {
					list2.add(new Ele(list.get(i), list.get(j)));
				}
			}

			Collections.sort(list2);
			System.out.println(list2.get(k - 1).get());
		}
	}

	public static class Ele implements Comparable<Ele> {
		int a, b;

		public Ele(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int compareTo(Ele other) {
			return this.get().compareTo(other.get());
		}

		public BigDecimal get() {
			return BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b));
		}

		@Override
		public String toString() {
			return a + ", " + b;
		}

	}
}
