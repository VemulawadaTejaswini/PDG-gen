public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a + b;
			String d = "" + c;
			System.out.println(d.length());
		}
	}
}
