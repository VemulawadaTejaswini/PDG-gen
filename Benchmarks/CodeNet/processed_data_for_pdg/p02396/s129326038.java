public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int u = 0;
		int x;
		while (true) {
			x = sc.nextInt();
			if (x == 0) {
				break;
			}System.out.println("Case " + (++u) + ": " + x);
		}
	}
}
