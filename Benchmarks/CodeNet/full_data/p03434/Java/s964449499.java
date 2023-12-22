import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		while (sc.hasNext()) {
			list.add(sc.nextInt());
		}
		Collections.sort(list,Comparator.reverseOrder());
		int cnt = 0;
		for (int i = 0 ; i < n / 2 ; i++) {
			cnt = cnt + list.get(i * 2) - list.get(i * 2 +1);
		}
		System.out.println(n % 2 == 1 ? cnt + list.get(n-1) : cnt);
	}
}
