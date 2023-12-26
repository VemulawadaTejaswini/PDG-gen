public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = 0;
		int r = 0;
		double f = 0;
		double double_a = a;
		double double_b = b;
		d = a / b;
		r = a % b;
		f = double_a / double_b;
		BigDecimal x = new BigDecimal(f);
		x = x.setScale(5, BigDecimal.ROUND_HALF_UP);
		System.out.println( d + " " + r + " " + x );
	}
}
