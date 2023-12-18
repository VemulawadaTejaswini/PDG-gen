public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a <= b) {
			if (c <= a)
				System.out.println(c + " " + a + " " + b);
			else if (b <= c)
				System.out.println(a + " " + b + " " + c);
			else
				System.out.println(a + " " + c + " " + b);
		} else {
			if (a <= c)
				System.out.println(b + " " + a + " " + c);
			else if (c <= b)
				System.out.println(c + " " + b + " " + a);
			else
				System.out.println(b + " " + c + " " + a);
		}		
	}
}
