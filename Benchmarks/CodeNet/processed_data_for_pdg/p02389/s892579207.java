public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader stdReader = new BufferedReader(new InputStreamReader(
				System.in));
		String line = stdReader.readLine();
		String[] tokens = line.split(" ");
		int x = Integer.parseInt(tokens[0]);
		int y = Integer.parseInt(tokens[1]);
		System.out.println((x * y) + " " + (x + y) * 2);
	}
}
