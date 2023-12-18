public class Main {
	public static void main(String[] args) {
		int a,b,c,t;
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		if(a>b) {
			t = a;
			a = b;
			b = t;
		}
		if(b>c) {
			t = b;
			b = c;
			c = t;
		}
		if(a>b) {
			t = a;
			a = b;
			b = t;
		}
		System.out.println(String.format("%d %d %d", a, b, c));
	}
}
