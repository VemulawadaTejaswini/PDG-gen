public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long sum = 0;
		if (a >= k) {
			sum = k;
		} else if (a < k && a + b >= k) {
			sum = a;
		} else {
			sum = a - (k - (a + b));
		}
		System.out.println(sum);
		sc.close();
	}
}
