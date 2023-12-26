public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long num = Math.floorDiv(n, (a + b)) * a;
        long rem = n % (a + b);
        num += Math.min(a, rem);
        System.out.println(num);
    }
}
