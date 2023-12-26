public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int b = (y - 2*x) / 2;
		int a = x - b;
		if((a+b) == x && (2*a + 4*b) == y && x != 0 && y != 0 && a >= 0 && b >= 0) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	}
}
