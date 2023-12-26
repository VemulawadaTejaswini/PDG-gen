public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		double x=scan.nextDouble();
		System.out.printf("%.6f %.6f",(Math.PI*x*x),(2*Math.PI*x));
		System.out.println();
	}
}
