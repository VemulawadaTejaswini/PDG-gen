public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int str = line.length();
		int end = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'A') {
				str = Math.min(str, i);
			} else if (line.charAt(i) == 'Z') {
				end = Math.max(end, i);
			}
		}
		System.out.println(end - str + 1);
	}
}
