public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		int l = Math.min(a.length(), b.length());
		System.out.println(a.substring(0, l).equals(b.subSequence(0, l)) ? "Yes" : "No");
	}
}
