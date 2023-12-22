public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String W = br.readLine().toLowerCase();
		int ans = 0;
		String line;
		while (!((line = br.readLine()).equals("END_OF_TEXT"))) {
			line = line.toLowerCase();
			StringTokenizer st = new StringTokenizer(line, " ");
			while (st.hasMoreTokens()) {
				if (st.nextToken().equals(W)) ans++;
			}
		}
		System.out.println(ans);
	}
}
