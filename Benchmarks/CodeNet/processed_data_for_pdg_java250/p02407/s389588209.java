public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String x = "";
		try {
			x = in.readLine();
			int num = Integer.parseInt(x);
			x = in.readLine();
			String[] num_s = x.split(" ");
			for (int i = 1; i < num; i++) {
				System.out.print(num_s[num - i] + " ");
			}
			System.out.println(num_s[0]);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
