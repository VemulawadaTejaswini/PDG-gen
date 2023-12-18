public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int w = 0;
		if(a > b) {
			w = b;
			b = a;
			a = w;
			if(b > c) {
				w = c;
				c = b;
				b = w;
			}
			if(a > b) {
				w = b;
				b = a;
				a = w;
			}
		} else if(b > c){
			w = c;
			c = b;
			b = w;
			if(a > b) {
				w = b;
				b = a;
				a = w;
			}
		}
		System.out.println(a + " " + b + " " + c);
	}
}
