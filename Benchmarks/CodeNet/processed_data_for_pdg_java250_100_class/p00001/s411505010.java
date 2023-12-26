public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int[] hills = new int[10001];
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			hills[parseInt(line)]++;
		}
		int count = 0;
		outer:
		for (int i = hills.length - 1; ; i--) {
			if (hills[i] > 0) {
				for (int j = 0; j < hills[i]; j++) {
					System.out.println(i);
					count++;
					if (count == 3) break outer;
				}
			}
		}
	}
}
