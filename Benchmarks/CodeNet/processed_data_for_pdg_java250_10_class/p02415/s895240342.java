public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String x = "";
		try {
			x = in.readLine();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < x.length(); i++) {
			char c = x.charAt(i);
			if ((c < 'A') || c > 'z') {
				System.out.print(c);
				continue;
			}
			if ((c - 'a') < 0) {
				c = (char)(c + ('a' - 'A'));
			} else {
				c = (char)(c - ('a' - 'A'));
			}
			System.out.print(c);
		}
		System.out.println();
	}
}
