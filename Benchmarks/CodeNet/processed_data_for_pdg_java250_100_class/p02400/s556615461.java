public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String str = br.readLine();
		    double r =  Double.parseDouble( str);
		    double men = r *r *Math.PI;
		    double syu =  r*2* Math.PI;
		    System.out.printf( "%.6f %.6f", r *r *Math.PI , r*2* Math.PI );
	}
}
