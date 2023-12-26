public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int inputData = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		String str;
		for (int i = 1; i <= inputData; i++) {
			if (i % 3 == 0) {
				sb.append(" " + i);
			} else if (i % 10 == 3) {
				sb.append(" " + i);
			} else {
				str = Integer.toString(i);
				if (str.contains("3")) {
					sb.append(" " + i);
				}
			}
		}
		System.out.println(sb.toString());
	}
}
