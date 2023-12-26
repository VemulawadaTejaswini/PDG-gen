public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
			String in = br.readLine();
			System.out.println(in.replaceFirst("2017", "2018"));
		}
	}
}
