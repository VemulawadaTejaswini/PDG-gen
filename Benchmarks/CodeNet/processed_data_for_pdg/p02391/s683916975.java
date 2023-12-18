public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String readline = br.readLine();
		String[] set = readline.split(" ");
		int a = Integer.parseInt(set[0]);
		int b = Integer.parseInt(set[1]);
		if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else  {
			System.out.println("a == b");
		}
	}
}
