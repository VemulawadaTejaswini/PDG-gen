public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int i = 1;
	    while (true) {
		    String line = br.readLine();
		    int x = Integer.parseInt(line);
		    if (x == 0) break;
		    System.out.println("Case " + (i++) + ": " + x);
	    }
	}
}
