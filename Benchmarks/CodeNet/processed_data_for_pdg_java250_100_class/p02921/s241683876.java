public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		String T = scanner.next();
		 int count=0;
		if (S.charAt(0)==T.charAt(0)) {
			count++;
		}
		if (S.charAt(1)==T.charAt(1)) {
			count++;
		}
		if (S.charAt(2)==T.charAt(2)) {
			count++;
		}
		System.out.println(count);
	}
}
