public class Main {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		System.out.printf("%d %d\n", w*h, (h+w)*2);
	}
}
