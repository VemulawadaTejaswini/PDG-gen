public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a <= b) {
			if (c <= a) {
				System.out.println(c + " " + a + " " + b);
			} else if (a < c && c <= b) {
				System.out.println(a + " " + c + " " + b);
			} else if (b < c) {
				System.out.println(a + " " + b + " " + c);
			}
		} else {
			if (c <= b) {
				System.out.println(c + " " + b + " " + a);
			} else if (b < c && c <= a) {
				System.out.println(b + " " + c + " " + a);
			} else if (a < c) {
				System.out.println(b + " " + a + " " + c);
			}
		}
	}
}
