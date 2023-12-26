public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder s = new StringBuilder(br.readLine());
		s.append(s);
		String p = br.readLine();
		if (s.indexOf(p) == -1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
