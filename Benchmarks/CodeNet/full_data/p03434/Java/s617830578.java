import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Integer> a = new ArrayList<>();

		for(int i=0; i<N; i++) {
			a.add(sc.nextInt());
		}

		Collections.sort(a, Comparator.reverseOrder());

		int alice = 0;
		int bob = 0;
		for(int i=0; i<N; i++) {
			if(i%2 == 0) alice += a.get(i);
			else bob += a.get(i);
		}

		println(alice - bob);

	}

	public static void print(Object o) {
		System.out.print(o);
	}

	public static void println(Object o) {
		System.out.println(o);
	}
}