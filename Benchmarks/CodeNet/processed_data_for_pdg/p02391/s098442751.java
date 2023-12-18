public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.printf("a %s b\n", (a > b) ? ">" : (a == b) ? "==" : "<");
	}
}
