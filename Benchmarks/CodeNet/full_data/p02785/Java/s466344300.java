import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> hs = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			hs.add(sc.nextInt());
		}
		Collections.sort(hs, Collections.reverseOrder());
		for (int i = 0; i < k && !hs.isEmpty(); i++) {
			hs.remove(0);
		}
		System.out.println(hs.stream().mapToLong(Long::valueOf).sum());
	}
}
