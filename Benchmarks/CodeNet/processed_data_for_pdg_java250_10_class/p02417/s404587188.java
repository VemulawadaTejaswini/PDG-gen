public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] iremono = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
				'w', 'x', 'y', 'z' };
		int[] cou = new int[26];
		int j = 0;
		while (sc.hasNext()) {
			String stralf = sc.nextLine();
			for (int i = 0; i < stralf.length(); i++) {
				char chalf = stralf.charAt(i);
				chalf = Character.toLowerCase(chalf);
				for (j = 0; j < 26; j++) {
					if (iremono[j] == chalf) {
						cou[j]++;
					}
				}
			}
		}
		for (int k = 0; k < 26; k++) {
			System.out.print(iremono[k]);
			System.out.println(" : " + cou[k]);
		}
	}
}
