public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strs = sc.nextLine();
		String strItti = sc.nextLine();
		String strMoji = strs + strs;
		if (strMoji.contains(strItti)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
