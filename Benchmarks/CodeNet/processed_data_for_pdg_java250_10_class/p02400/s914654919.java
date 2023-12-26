public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		double surface = r * r * Math.PI;
		double length = 2 * r * Math.PI;
		System.out.printf("%.6f %.6f", surface, length);
	}
}
