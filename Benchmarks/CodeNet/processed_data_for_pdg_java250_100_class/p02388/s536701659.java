public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = System.out;
		int x = Integer.parseInt(in.readLine());
		out.println((int)Math.pow(x, 3));
	}
}
