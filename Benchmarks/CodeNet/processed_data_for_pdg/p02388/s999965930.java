public class Main {
	public static void main(String[] args) {
		int x = new Scanner(System.in).nextInt();
		if (x < 1 || x > 100) {
			throw new IllegalArgumentException("input number error");
		}
		x = (int) Math.pow(x, 3);
		System.out.println(x);
	}
}
