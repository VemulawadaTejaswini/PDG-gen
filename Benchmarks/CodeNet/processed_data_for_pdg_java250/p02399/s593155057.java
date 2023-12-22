public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String x = "";
		try {
			x = in.readLine();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] values = x.split(" ");
		long a = Integer.parseInt(values[0]);
		long b = Integer.parseInt(values[1]);
		String ans = String.format("%f", ((double)a / b));
		System.out.println((a / b) + " " + (a % b) + " " + ans);
	}
}
