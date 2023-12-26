public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String x = "";
		try {
			x = in.readLine();
			String tmp = "";
			for (int i = 0; i < x.length(); i++) {
				tmp = tmp + x.charAt(x.length() - i - 1);
			}
			System.out.println(tmp);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
