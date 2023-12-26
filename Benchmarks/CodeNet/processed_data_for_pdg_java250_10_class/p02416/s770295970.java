public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.next();
			if (str.equals("0")) {
				break;
			}
			String[] strArry = str.split("");
			int x = 0;
			int sum = 0;
			for (int i = 0; i < strArry.length; i++) {
				sum = sum + x;
			}
			System.out.println(sum);
		}
	}
}
