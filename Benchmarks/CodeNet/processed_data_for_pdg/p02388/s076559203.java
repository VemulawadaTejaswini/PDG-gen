public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int x = Integer.parseInt(str);
		System.out.println(String.format("%.0f", Math.pow(x, 3)));
	}
}
