public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
			String in = br.readLine();
			String chr[] = in.split("");
			List<String> ans = Arrays.asList(chr);
			System.out.println(ans.contains("7")?"Yes":"No");
		}
	}
}
