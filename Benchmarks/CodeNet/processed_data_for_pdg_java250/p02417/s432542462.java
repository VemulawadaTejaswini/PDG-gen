public class Main {
	public static void main(String[] args) throws IOException {
		char alpha = 'a';
		int[] count = new int[26];
		String str;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			str = sc.next();
			str = str.toLowerCase();
			for (int i = 0; i < str.length(); ++i) {
				int a = str.charAt(i);
				if(isLetter(a)){ 
				count[str.charAt(i) - 'a']++; 
				}
			}
		}
		for (int j = 0; j < 26; ++j) {
			System.out.println(alpha++ + " : " + count[j]);
		}
		sc.close();
	}
}
