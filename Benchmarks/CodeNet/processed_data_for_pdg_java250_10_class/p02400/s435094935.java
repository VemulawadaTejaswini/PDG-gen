public class Main {
	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		double x = Math.PI * r * r;
		double y = 2 * Math.PI * r;
		String men = String.format("%.6f", x);
		String en = String.format("%.6f", y);
		System.out.println(men + " " + en);
		br.close();
	}
}
