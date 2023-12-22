import java.util.*;

class Main {
    public static void main(String... args) {
        int N = IN.nextInt();
		int X = IN.nextInt();
		List<Integer> xs = new ArrayList<Integer>();
		xs.add(X);
		for (int i = 0; i < N; i++) {
			xs.add(IN.nextInt());
		}
		xs.sort((i, j) -> i - j);
		int ans = xs.get(1) - xs.get(0);
		for (int i = 1; i < N; i++) {
			int tmp = xs.get(i + 1) - xs.get(i);
			ans = euclid(ans, tmp);
		}
		puts(ans);
	}

	static int euclid(int a, int b) {
		int c = a % b;
		if (c == 0) {
			return b;
		} else {
			return euclid(b, c);
		}
	}

    static final Scanner IN = new Scanner(System.in);
    static <T> void puts(T arg) { System.out.println(arg); }
}
