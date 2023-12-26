public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder(bufferedReader.readLine());
		System.out.println(builder.reverse());
	}
}
