public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer buffer = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(buffer.nextToken());
			int b = Integer.parseInt(buffer.nextToken());
			System.out.println(a * b + " " + (a + b ) * 2);
	}
}
