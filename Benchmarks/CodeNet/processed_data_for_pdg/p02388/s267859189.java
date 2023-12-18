public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in) );
		System.out.println( (int)Math.pow( Integer.parseInt( in.readLine() ), 3 ) );
	}
}
