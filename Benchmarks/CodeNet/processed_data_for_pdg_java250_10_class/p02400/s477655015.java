public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		DecimalFormat dmfmt = new DecimalFormat("0.000000");
		System.out.println(dmfmt.format(r * r * Math.PI) + " " + dmfmt.format(r * 2 * Math.PI));
	}
}
