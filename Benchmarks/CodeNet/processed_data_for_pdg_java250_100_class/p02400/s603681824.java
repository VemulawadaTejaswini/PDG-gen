public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = br.readLine();
	    line = line.trim();
	    String[] readLineArray = line.split("[\\s+]");
	    double r = Double.parseDouble(readLineArray[0]);
	    double S = Math.PI *r*r;
	    double L = 2 * Math.PI * r;
	    System.out.printf("%.5f %.5f",S,L);
	}
}
