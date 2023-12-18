public class Main {
	private static Scanner sc;
	public static void main(String[] args) throws java.lang.Exception {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a < b) {
			System.out.println("a < b");
		} else if (a == b){
			System.out.println("a == b");
		} else {
			System.out.println("a > b");
		}
	}
}
