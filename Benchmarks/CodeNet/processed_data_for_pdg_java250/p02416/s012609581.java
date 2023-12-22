public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String x = "";
		try {
			while ((x = in.readLine()).equals("0") == false) {
				int sum = 0;
				for (int i = 0; i < x.length(); i++) {
					sum = sum + x.charAt(i) - '0';
				}
				System.out.println(sum);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
