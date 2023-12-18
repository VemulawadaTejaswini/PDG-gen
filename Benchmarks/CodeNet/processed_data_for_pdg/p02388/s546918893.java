public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		int x = Integer.parseInt(line);
		System.out.println(x * x * x);
		br.close();
	}
}
