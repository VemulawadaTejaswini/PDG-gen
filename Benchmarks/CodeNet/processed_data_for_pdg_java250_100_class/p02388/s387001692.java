public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer buffer = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(buffer.nextToken());
			System.out.println(x * x * x);
	}
}
