public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str, W;
		int result = -1;
		int sum = 0;
		W = scan.next().toLowerCase();
		while (true) {
			str = scan.next();
			if (str.equals("END_OF_TEXT")) {
				break;
			}
			str = str.toLowerCase();
			result = str.indexOf(W);
			if ((result == 0) & (str.length() == W.length())) {
				sum++;
				result = -1;
			}
		}
		System.out.println(sum);
	}
}
