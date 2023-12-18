class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		int tmp = 0;
		Boolean flag = false;
		do {
			flag = false;
			if (a > b) {
				tmp = a;
				a = b;
				b = tmp;
				flag = true;
			}
			if (b > c) {
				tmp = b;
				b = c;
				c = tmp;
				flag = true;
			}
		} while (flag);
		System.out.println(a + " " + b + " " + c);
	}
}
