public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max_n = Math.max(a, b);
		int min_n = Math.min(a, b);
		if (c >= max_n) {
			System.out.println(min_n + " " + max_n + " " + c);
		} else if (c <= min_n) {
			System.out.println(c + " " + min_n + " " + max_n);
		} else {
			System.out.println(min_n + " " + c + " " + max_n);
		}
		sc.close();
	}
}
