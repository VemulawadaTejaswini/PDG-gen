import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			q[i] = sc.nextInt();
		}

		List<Integer> pList = Arrays.stream(p).boxed().collect(Collectors.toList());
		List<Integer> qList = Arrays.stream(q).boxed().collect(Collectors.toList());
		int a = m(pList, Arrays.stream(p).sorted().boxed().collect(Collectors.toList()));
		int b = m(qList, Arrays.stream(p).sorted().boxed().collect(Collectors.toList()));
		System.out.println(Math.abs(a - b));
	}

	public static int m(List<Integer> l, List<Integer> n) {
		if (l.size() == 0) {
			return 1;
		}
		int i = l.get(0);
		int x = n.indexOf(i);
		l.remove(0);
		n.remove((Object) i);
		x = x * k(l.size());

		return x + m(l, n);
	}

	public static int k(int i) {
		if (i == 0) {
			return 1;
		}
		return i * k(i - 1);
	}
}
