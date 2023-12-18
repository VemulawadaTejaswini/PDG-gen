public class Main {
	public static void main(String[] arts) {
		Scanner sc = new Scanner(System.in);
		int length = 0;
		int breadth = 0;
		int x = sc.nextInt();
		length = x;
		x = sc.nextInt();
		breadth = x;
		System.out.println((length * breadth) + " " + (2 * (length + breadth)));
		sc.close();
	}
}
