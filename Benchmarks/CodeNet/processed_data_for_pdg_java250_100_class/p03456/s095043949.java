public class Main {
	public static void main(String args[]) throws Exception {
		double d = Math.sqrt(
				Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine().replace(" ", "")));
		System.out.println((int) d == d ? "Yes" : "No");
	}
}
