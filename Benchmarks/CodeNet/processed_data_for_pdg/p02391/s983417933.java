public class Main {
	public static void main(String[] args) throws IOException {
		int a, b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] strArray = input.split(" ");
		a = Integer.parseInt(strArray[0]);
		b = Integer.parseInt(strArray[1]);
		if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a == b");
		}
	}
}
