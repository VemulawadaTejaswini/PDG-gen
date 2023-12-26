public class Main {
	public static void main(String[] args) throws IOException {
		int count = 0;
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.next(); 
		while (true) {
			String tmp = sc.next();
			if (tmp.equals("END_OF_TEXT")) {
				break;
			}
			if (str.length() == tmp.length()) {
				if (str.equalsIgnoreCase(tmp)){
					++count;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
