public class Main {
		public static void main(String[] args) {
			int a, b, c, temp;
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if (a > b) { temp = a; a = b; b = temp;}
			if (b > c) { temp = b; b = c; c = temp;}
			if (a > b) { temp = a; a = b; b = temp;}
			System.out.println(a + " " + b + " " + c);
	}
}
