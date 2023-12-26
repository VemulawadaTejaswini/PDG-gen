public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] abc = sc.nextLine().split(" ");
		int a = Integer.parseInt(abc[0]);
		int b = Integer.parseInt(abc[1]);
		int c = Integer.parseInt(abc[2]);
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
