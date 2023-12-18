public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);) {
			int i = 1;
			int x;
			while((x = sc.nextInt()) != 0) {
				System.out.println("Case " + i++ + ": " + x);
			}
		}
	}
}
