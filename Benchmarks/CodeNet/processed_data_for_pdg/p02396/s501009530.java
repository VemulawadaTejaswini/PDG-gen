public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String inputLine;
			Integer dataset = 1;
			while ((inputLine = br.readLine()) != null) {
				final Integer number = Integer.valueOf(inputLine);
				if (number.equals(0)) {
					break;
				}
				System.out.println("Case " + dataset++ + ": " + number);
			}
		}
	}
}
