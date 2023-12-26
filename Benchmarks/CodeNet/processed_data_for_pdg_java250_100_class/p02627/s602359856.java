public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		char s = S.charAt(0);
		System.out.println(Character.isUpperCase(s)?"A":"a");
	}
}
