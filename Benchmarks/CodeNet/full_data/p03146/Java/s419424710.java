import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		set.add(s);
		for (int i = 2; i <= 1000000; i++) {
			s = func(s);
			if (set.contains(s)) {
				System.out.println(i);
				break;
			}
			set.add(s);
		}
	}
	
	static int func(int n) {
		if (n % 2 == 0) {
			return n / 2;
		} else {
			return n * 3 + 1;
		}
	}
}
