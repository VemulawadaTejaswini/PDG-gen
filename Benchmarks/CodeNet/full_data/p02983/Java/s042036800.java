public class Main {

	private static final int BASE_NUM=2019;

	public static void main(String[] args) {
		if (args == null || args.length != 2) return;

		int L = Integer.parseInt(args[0]);
		int R = Integer.parseInt(args[1]);

		if (L <= BASE_NUM) {
			System.out.println(L * R);
		} else {
			System.out.println(2);
		}
	}
}