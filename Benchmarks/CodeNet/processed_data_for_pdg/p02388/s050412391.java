public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf = br.readLine();
		int cubic = Integer.parseInt(buf);
		cubic = cubic * cubic * cubic;
		System.out.println(cubic);
	}
}
