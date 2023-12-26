public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.printf("%.6f %.6f", (Math.PI*r*r), (Math.PI*2*r));
	}
}
