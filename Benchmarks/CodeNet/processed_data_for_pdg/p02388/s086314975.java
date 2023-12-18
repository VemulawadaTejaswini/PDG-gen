public class Main {
    public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		String s = r.readLine();
		int n = Integer.parseInt(s);
		n = n * n * n;
    	System.out.println(n);
    }
}
