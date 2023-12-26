public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String str_r = "";
		int i;
		for(i = 0; i < str.length(); i++) {
			str_r = str_r + str.charAt(str.length() - i - 1);
		}
		scanner.close();
		System.out.println(str_r);
	}
}
