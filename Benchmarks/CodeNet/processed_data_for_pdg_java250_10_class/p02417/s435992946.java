public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = "";
		char temp;
		int[] array = new int[26];
		while (sc.hasNext()) {
			line = sc.nextLine();
			String lower = line.toLowerCase();
			for (int i = 0; i < lower.length(); i++) {
				temp = lower.charAt(i);
				if ('a' <= temp && temp <= 'z') {
					array[temp - 'a']++;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println((char) ('a' + i) + " : " + array[i]);
		}
	}
}
