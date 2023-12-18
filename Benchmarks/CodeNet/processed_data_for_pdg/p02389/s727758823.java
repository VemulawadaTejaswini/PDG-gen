public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		stdIn.close();
		System.out.println(x*y + " " + 2*(x+y));
	}
}
