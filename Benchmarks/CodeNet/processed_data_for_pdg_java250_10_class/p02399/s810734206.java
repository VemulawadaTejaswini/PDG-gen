public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = br.readLine();
	    line = line.trim();
	    String[] readLineArray = line.split("[\\s+]");
	    int a = Integer.parseInt(readLineArray[0]);
	    int b = Integer.parseInt(readLineArray[1]);
	    int d = a/b;
	    int r = a%b;
	    double f = (double)a/(double)b;
	    System.out.printf("%d %d %.5f\n",d,r,f);
	}
}
