public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a < b) {
			x = a;
			y = b;
		} else {
			x = b;
			y = a;
		}
		int c = sc.nextInt();
		if (y < c) {
			z = c;
		} else if (x < c) {
			z = y;
			y = c;
		} else {
			z = y;
			y = x;
			x = c;
		}
		System.out.println(x + " " + y + " " + z);
		sc.close();
	}
}
