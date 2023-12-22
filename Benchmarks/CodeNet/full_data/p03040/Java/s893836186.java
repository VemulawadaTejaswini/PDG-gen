import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public final class Main {

	private static final Scanner sc = new Scanner(System.in);
	static PrintWriter writer = new PrintWriter(System.out);

	public static void main(String[] args) {
		int Q = sc.nextInt();
		TreeSet<Long> set = new TreeSet<>();
		sc.next();
		long minima = sc.nextLong() << 32;
		set.add(minima << 32);
		long upperSum = 0;
		long lowerSum = 0;
		long sumB = sc.nextInt();
		for (int i = 1; i < Q; i++) {
			int type = sc.nextInt();
			if (type == 1) {
				long a = (sc.nextLong() << 32) + i;
				sumB += sc.nextInt();
				set.add(a);
				if (a < minima) {
					lowerSum += a >> 32;
					if (set.size() % 2 == 0) {
						upperSum += minima >> 32;
						minima = set.lower(minima);
						lowerSum -= minima >> 32;
					}
				} else {
					upperSum += a >> 32;
					if (set.size() % 2 != 0) {
						lowerSum += minima >> 32;
						minima = set.higher(minima);
						upperSum -= minima >> 32;
					}
				}
			} else {
				int countU = set.size() / 2;
				int countL = (set.size() - 1) - countU;
				long ans = minima >> 32;
				long v = upperSum - ans * countU;
				v += ans * countL - lowerSum;
				v += sumB;
				writer.println(ans + " " + v);
			}
		}
		writer.flush();
	}

}