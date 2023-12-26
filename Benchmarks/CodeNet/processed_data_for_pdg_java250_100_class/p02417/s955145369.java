public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] cnt = new int[26];
		String line;
		while ((line = br.readLine()) != null) {
			char[] chars = line.toCharArray();
			for (char c : chars) {
				if (!isLowerCase(c) && !isUpperCase(c))
					continue;
				cnt[toLowerCase(c) - 'a']++;
			}
		}
		for (int i = 0; i < cnt.length; i++) {
			System.out.print((char) ('a' + i));
			System.out.println(" : " + cnt[i]);
		}
	}
}
