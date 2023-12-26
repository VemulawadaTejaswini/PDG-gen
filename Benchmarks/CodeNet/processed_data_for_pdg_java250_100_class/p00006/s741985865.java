public class Main {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		String str2 = new String(sb);
		System.out.println(str2);
	}
}
