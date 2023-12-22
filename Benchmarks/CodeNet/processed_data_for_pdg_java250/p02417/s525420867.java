public class Main {
	public static void main(String[] args) throws IOException {
		final char ASCII_CODE_BASE = 97;
		int counts[] = new int[26];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str = br.readLine()) != null) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(Character.isAlphabetic(c)) {
					char lowerChar = Character.toLowerCase(c);
					counts[lowerChar - ASCII_CODE_BASE]++;
				}
			}
		}
		for (int i = 0; i < counts.length; i++) {
			System.out.println((char)(i+ASCII_CODE_BASE) + " : " + counts[i]);
		}
	}
}
