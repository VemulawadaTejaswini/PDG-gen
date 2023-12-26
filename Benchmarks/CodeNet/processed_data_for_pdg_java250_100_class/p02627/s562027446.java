public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = a;
		b = a.toUpperCase();
		if (a == b) {
			System.out.print("A");
		} else {
			System.out.print("a");
		}
	}
}
