public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		String anser = "";
		try {
			sc = new Scanner(System.in);
			String line = sc.nextLine();
			char[] check = line.toCharArray();
			for (int i = 0; i < check.length; i++) {
				if (Character.isUpperCase(check[i])) {
					check[i] = Character.toLowerCase(check[i]);
				}else {
					check[i] = Character.toUpperCase(check[i]);
				}
			}
			System.out.println(check);
		} finally {
			sc.close();
		}
	}
}
