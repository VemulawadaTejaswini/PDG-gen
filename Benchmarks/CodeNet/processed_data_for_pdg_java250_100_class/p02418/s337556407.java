public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String p = sc.nextLine();
		String ss = s + s;
		if ( ss.matches(".*" + p + ".*") )
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
