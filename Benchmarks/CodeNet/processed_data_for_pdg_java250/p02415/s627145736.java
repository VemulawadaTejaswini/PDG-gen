public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		char c;
		String ch, charc;
		Pattern p = Pattern.compile("[a-zA-Z]");
		Matcher m;
		ch = scan.nextLine();
		StringBuilder sb = new StringBuilder(ch);
		for( int i = 0; i < ch.length(); i++) {
			c = ch.charAt(i);
			charc = String.valueOf(c);
			m = p.matcher(charc);
			if(m.find()) {
				if(Character.isUpperCase(c)) {
					charc = charc.toLowerCase();
				}else {
					charc = charc.toUpperCase();
				}
				char cc [] = charc.toCharArray();
				sb.setCharAt(i, cc[0]);
			}
		}
		System.out.println(sb);
	}
}
