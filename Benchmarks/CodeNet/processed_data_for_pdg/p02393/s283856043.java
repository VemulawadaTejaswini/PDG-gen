public class Main {
	public static void main(String[] args) {
		int tmp;
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		if(b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		if(a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
