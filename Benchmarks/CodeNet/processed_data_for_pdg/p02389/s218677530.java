public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int area = x * y;
		int length = 2 * (x + y);
		System.out.println(area + " " + length);
	}
}
