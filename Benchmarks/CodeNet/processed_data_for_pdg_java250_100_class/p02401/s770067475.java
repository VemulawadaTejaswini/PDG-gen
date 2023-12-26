public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			String line = sc.next();
			char op = line.charAt(0);
			int b = sc.nextInt();
			if(op == '?'){
				break;
			}
			switch (op) {
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println(a / b);
				break;
			}
		}
		sc.close();
	}
}
