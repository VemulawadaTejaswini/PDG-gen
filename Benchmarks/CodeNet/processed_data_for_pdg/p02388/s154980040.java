public class Main {
	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = null;
		try {
			x = br.readLine();
			br.close();
		} catch (IOException e) {
		}
		int x1 = Integer.parseInt(x);
		System.out.println(x1 * x1 * x1);
	}
}
