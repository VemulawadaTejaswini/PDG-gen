public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    StringTokenizer st = new StringTokenizer(str, " ");
		  int x  = Integer.parseInt(st.nextToken());
		  int y  = Integer.parseInt(st.nextToken());
		  System.out.print(x * y);
		  System.out.print(" ");
		  System.out.println((2*x) + (2*y));
	}
}
