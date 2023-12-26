public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int count = str.length() - str.replaceAll("1", "").length();
		System.out.println(count);
		scanner.close();
	}
}
