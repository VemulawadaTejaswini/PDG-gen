public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long num = n / (a + b);
		num = num * a;
		long amari = n % (a + b);
		if (amari <= a) {
			num += amari;
		} else if (amari > a) {
			num += a;
		}
		System.out.println(num);
		sc.close();
	}
}
