public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		long k = Long.parseLong(str[1]);
		int count = 0;
		int value = 1;
		while (value < k) {
			value--;
			value += n;
			count++;
		}
		System.out.println(count);
	}
}
