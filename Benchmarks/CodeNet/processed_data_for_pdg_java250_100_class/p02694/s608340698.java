public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long X = scanner.nextLong();
		double P = 100;
		int count =0;
		while (P < X) {
			P = P *1.01;
			P = Math.floor(P);
			count++;
		}
		System.out.println(count);
	}
}
