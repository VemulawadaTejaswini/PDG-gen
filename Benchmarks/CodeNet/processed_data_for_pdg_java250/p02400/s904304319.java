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
		double r = Double.parseDouble(x);
		String ans = String.format("%f %f", r * r * Math.PI, 2 * r * Math.PI);
		System.out.println(ans);
	}
}
