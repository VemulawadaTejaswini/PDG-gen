public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int x = scan.nextInt();
			x = x*x*x;
			System.out.println("" + x + "");
		} catch (InputMismatchException e) {
			System.out.println("??¨??????");
		}
	}
}
