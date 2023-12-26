public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		double area = r * r * Math.PI;
		double length = r * 2 * Math.PI;
		System.out.printf("%.6f", area);
		System.out.print(" ");
		System.out.printf("%.6f", length);
	}
}
