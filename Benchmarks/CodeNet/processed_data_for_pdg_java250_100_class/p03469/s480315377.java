public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String s = stdin.next();
		char[] c;
		c = s.toCharArray();
		c[3]='8';
		System.out.println(c);
	}
}
