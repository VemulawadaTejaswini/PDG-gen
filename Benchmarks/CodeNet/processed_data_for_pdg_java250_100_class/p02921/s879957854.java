public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split("");
		String str2[] = br.readLine().split("");
		int a[] = new int[str.length];
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			if (str[i].equals(str2[i])) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
