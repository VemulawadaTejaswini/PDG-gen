public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int count500 = X/500;
		int too = X%500;
		int count5 = too/5;
		System.out.println(count500 * 1000 + count5 * 5);
	}
}
