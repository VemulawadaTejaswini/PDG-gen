public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String moji = sc.nextLine();
			if (moji.equals("0")){
				break;
			} else {
				int intKekka = 0;
				char[] kowake = new char[moji.length()];
				for (int i = 0; i < moji.length(); i++) {
					kowake[i] = moji.charAt(i);
					intKekka += kowake[i] - 48;
				}
				System.out.println(intKekka);
			}
		}
	}
}
