public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
		System.out.printf("%6f %6f", a * a * Math.PI, a * 2 * Math.PI);
	}
}
