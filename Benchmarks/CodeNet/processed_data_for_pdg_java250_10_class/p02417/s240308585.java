public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int[] cou = new int[26];
		while (sc.hasNext()) {
			String stralf = sc.nextLine();
			stralf = stralf.toLowerCase();
			char[] chalf = stralf.toCharArray();
			for (int i = 0; i < chalf.length; i++) {
				if (chalf[i] >= 'a' && chalf[i] <= 'z')
					cou[chalf[i] - 'a']++;
			}
		}
		for (int k = 0; k < 26; k++) {
			System.out.println((char) ('a' + k) + " : " + cou[k]);
		}
	}
}
