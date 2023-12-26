public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double Pi = Math.PI;
		double menseki_x = r * r * Pi;
		double syuu_y = 2 * r * Pi;
				BigDecimal menseki = new BigDecimal(menseki_x);
				menseki = menseki.setScale(5, BigDecimal.ROUND_HALF_UP);
				BigDecimal syuu = new BigDecimal(syuu_y);
				syuu = syuu.setScale(5, BigDecimal.ROUND_HALF_UP);
		System.out.println(menseki +" "+ syuu);
	}
}
