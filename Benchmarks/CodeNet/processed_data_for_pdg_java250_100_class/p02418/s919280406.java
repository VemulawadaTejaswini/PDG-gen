public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = scan.nextLine();
		String p = scan.nextLine();
		String ss = s + s;
		if (ss.matches(".*" + p + ".*")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
