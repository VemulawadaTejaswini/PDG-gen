public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
			int in = Integer.parseInt(br.readLine());
			System.out.println(in * 2 * Math.PI);
		}
	}
}
