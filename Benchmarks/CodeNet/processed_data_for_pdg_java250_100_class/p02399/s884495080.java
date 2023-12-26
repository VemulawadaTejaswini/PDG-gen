public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		double d;
		d = 0.0;
		System.out.print(Integer.toString(a / b) + " ");
		System.out.print(Integer.toString(a % b) + " ");
		d = Double.parseDouble(Integer.toString(a) + ".0");
		BigDecimal x = new BigDecimal(d / b);
		System.out.print(x.setScale(5, BigDecimal.ROUND_HALF_UP));
	}
}
