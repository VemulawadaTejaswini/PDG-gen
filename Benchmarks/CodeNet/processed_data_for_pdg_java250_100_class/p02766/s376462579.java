public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int K = sc.nextInt();
		int digits = 0;
		while (N >= Math.pow(K, digits)) {
			digits++;
		}
		System.out.println(digits);
		sc.close();
	}
}
