public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		double h = (double)H / 12.0;
		h += (double)M / 60.0 / 12.0; 
		double m = (double)M / 60.0;
		double rad = Math.PI * 2 * (h - m);
		double rsq = (A * A) + (B * B) - (2 * A * B * Math.cos(rad));
		System.out.println(Math.sqrt(rsq));
	}
}
