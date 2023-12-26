public class Main {
	public static void main(String[] args) {
		long ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;
		long n = sc.nextLong();
		double k = 100;
		double r = 1.01;
		do {
			k = Math.floor(k * r);
			ans++;
		} while(k < n);
		System.out.println(ans);
		sc.close();
	}
}
