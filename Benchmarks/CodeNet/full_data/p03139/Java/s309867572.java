public class Main {

	public static void main(String[] args) {

		int N = Integer.valueOf(args[0]);
		int A = Integer.valueOf(args[1]);
		int B = Integer.valueOf(args[2]);

		exec(N, A, B);

	}

	private static void exec(int _N, int _A, int _B) {

		int max = 0;
		if (_A > _B) {
			max = _B;
		} else {
			max = _A;
		}

		int min = 0;
		min = _A + _B;
		if (min > _N) {
			min -= _N;
		} else {
			min = 0;
		}

		System.out.println(Long.toString(max) + " " + Long.toString(min));
	}

}
