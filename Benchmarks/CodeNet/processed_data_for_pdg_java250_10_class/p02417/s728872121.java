public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\r\\n");
		int count[];
		count = new int[26];
		int x = 0;
		while(scan.hasNext()) {
			String S = scan.nextLine();
			if(S.equals ("")) break;
			int sl = S.length();
			if(sl == 0000) break;
			String s = S.toLowerCase();
			char[] charArray = s.toCharArray();
			for (char ch : charArray) {
				int CH = ch;
				x = CH;
				if(((CH-97)>=0) && ((CH-97)<26)){
					count[CH-97]++;
				}
			}
			if(x == 0000) break;
		}
		for (int i=0; i<26; i++) {
			int cords = i + 97;
			char c = (char)cords;
			System.out.println(c + " : " + count[i]);
		}
	}
}
