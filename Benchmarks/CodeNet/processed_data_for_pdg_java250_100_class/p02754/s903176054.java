public class Main {
	public static final int MOD = 1000000007;
	public static final int M = 3;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		sc.close();
		long c = n / (a+b);
		long d = n % (a+b);
		out.println(c*a+Math.min(a, d));
	}
}
