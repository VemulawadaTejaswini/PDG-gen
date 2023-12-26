public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ans = br.readLine();
		ans = ans.replaceAll("1", "a");
		ans = ans.replaceAll("9", "1");
		System.out.println(ans.replaceAll("a", "9"));
	}
}
