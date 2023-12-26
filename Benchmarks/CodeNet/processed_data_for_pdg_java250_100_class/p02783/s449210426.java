public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double H = scanner.nextInt();
		double A = scanner.nextInt();
		double ans = Math.ceil(H/A);
		System.out.println((int)ans);
	}
}
