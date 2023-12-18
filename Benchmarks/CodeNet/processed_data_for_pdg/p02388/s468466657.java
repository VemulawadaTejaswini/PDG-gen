public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = br.readLine();
			int x = Integer.parseInt(input);
			System.out.println(x * x * x);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
