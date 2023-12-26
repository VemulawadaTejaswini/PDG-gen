public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double a= Double.parseDouble(reader.readLine());
		System.out.printf("%6f %6f",a*a*Math.PI,a*2*Math.PI);
	}
}
