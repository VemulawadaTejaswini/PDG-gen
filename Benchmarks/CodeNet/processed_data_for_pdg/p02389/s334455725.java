public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		while(a < 1 && b > 100) { 
			a = stdIn.nextInt();
			b = stdIn.nextInt();
		}
		System.out.println(a * b + " " + 2 * (a + b));
	}
}
