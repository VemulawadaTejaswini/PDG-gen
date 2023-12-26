public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int ans = 0;
		ans = Math.max(ans, a + a -1);
		ans = Math.max(ans, a + b);
		ans = Math.max(ans, b + b -1);
		System.out.println(ans);
	}
}
