public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String s = input + input.substring(0, input.length()-1);
		String p = br.readLine();
		if (s.indexOf(p) > -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
