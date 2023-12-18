public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int feld = x * y;
		int round = 2 * x + 2 * y;
		System.out.print(feld + " ");
		System.out.println(round);
	}
}
