abstract class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		char ch[] = words.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				ch[i] = Character.toLowerCase(ch[i]);
			} else {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		for (char chage : ch) {
			System.out.print(chage);
		}
System.out.print("\n");
	}
}
