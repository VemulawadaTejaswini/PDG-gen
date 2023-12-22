public class Main{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		final String infoW = sc.next();
		int cnt = 0;
		while (true) {
			final String  strT = sc.next();
			if ("END_OF_TEXT".equals(strT)) {
				break;
			} else if (infoW.equalsIgnoreCase(strT)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
