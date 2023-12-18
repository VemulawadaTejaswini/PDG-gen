public class Main {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		if (a > b) {
			System.out.println("a > b");
		}
		else if (a < b) {
			System.out.println("a < b");
		}
		else {
			System.out.println("a == b");
		}
		sc1.close();
	}
}
