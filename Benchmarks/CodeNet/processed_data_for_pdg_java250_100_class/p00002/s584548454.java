public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] number = line.split(" ");
			System.out.println(String
					.valueOf(
							(Integer.parseInt(number[0]) + Integer
									.parseInt(number[1]))).length());
		}
	}
}
