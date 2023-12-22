import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> d = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			d.add(sc.nextInt());
		}
		Collections.sort(d);
		int print = d.get(n / 2) - d.get(n / 2 - 1);
		System.out.println(print);
	}
}