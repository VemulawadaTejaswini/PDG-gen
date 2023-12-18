public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int ans = a * b;
		int ans2 = (2 * a) + (2 * b);
		System.out.println(ans + " " + ans2);
	}
}
