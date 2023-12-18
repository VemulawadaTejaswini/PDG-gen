public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int menseki = 0;
		int syuu = 0;
		menseki = a * b;
		syuu = (a + b) * 2;
		System.out.println(menseki +" "+ syuu);
	}
}
