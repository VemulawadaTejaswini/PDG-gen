public class Main {
	public static void main(String[] args) {
		int n =1;
		int x;
		Scanner scan = new Scanner(System.in);
		while((x = scan.nextInt()) != 0) {
			System.out.println("Case " + n++ + ": " + x);
		}
	}
}
