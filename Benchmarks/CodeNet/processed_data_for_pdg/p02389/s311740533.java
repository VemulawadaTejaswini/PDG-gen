public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		String s = bfr.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.print(a * b);
		System.out.print(" ");
		System.out.println((a + b) * 2 );
	}
}
