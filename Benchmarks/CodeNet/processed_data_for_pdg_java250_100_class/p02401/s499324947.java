public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		String op = "";
		int b = 0;
		int ans = 0;
		while(true) {
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
			if(op.equals("?")) {
				break;
			}
			switch(op) {
			case "+":
				ans = a + b;
				break;
			case "-":
				ans = a - b;
				break;
			case "*":
				ans = a * b;
				break;
			case "/":
				if(b != 0) {
					ans = a/ b;
				}
				break;
			}
			System.out.println(ans);
		}
	}
}
