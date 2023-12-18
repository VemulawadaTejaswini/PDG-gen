public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b) {
			if (a > c) {
				if (c > b) {
					int tmp = b;
					b = c;
					c = tmp;
				}
			} else {
				int tmp = a;
				a = c;
				c = tmp;
				if (c > b) {
					tmp = b;
					b = c;
					c = tmp;
				}
			}
		} else {
			int tmp = a;
			a = b;
			b = tmp;
			if (a > c) {
				if (c > b) {
					tmp = b;
					b = c;
					c = tmp;
				}
			} else {
				tmp = a;
				a = c;
				c = tmp;
				if (c > b) {
					tmp = b;
					b = c;
					c = tmp;
				}
			}
		}
		System.out.println(c + " " + b + " " + a);
		sc.close();
	}
}
