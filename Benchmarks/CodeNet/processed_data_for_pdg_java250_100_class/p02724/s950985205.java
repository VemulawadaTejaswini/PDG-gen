public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long X = scanner.nextLong();
		long c500 = X / 500;
		long r500 = X % 500; 
		long c5 = r500 / 5;
		System.out.println(c500 * 1000 + c5 * 5);
		scanner.close();
	}
}
