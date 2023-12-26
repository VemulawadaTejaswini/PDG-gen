public class Main{
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String str = br.readLine();
		    double r =  Double.parseDouble( str);
		    double men = (double) r *r *Math.PI;
		    double syu = (double) r*2* Math.PI;
		    System.out.printf( "%.6f %.6f",men , syu );
	}
}
