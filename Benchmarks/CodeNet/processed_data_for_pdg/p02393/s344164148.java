public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int a = number.nextInt();
		int b = number.nextInt();
		int c = number.nextInt();
		int d;
		if(a > b) {
			d = a;
			a = b;
			b = d;
		}
		if(a > c) {
			d = a;
			a = c;
			c = d;
		}
		if(b > c) {
			d = b;
			b = c;
			c = d;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
