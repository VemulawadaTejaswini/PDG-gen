public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String p = scan.next();
		String S = s + s;
		if (S.matches(".*" + p + ".*")) {
		    System.out.println("Yes");
		}
		else {
		    System.out.println("No");
		}
	}
}
