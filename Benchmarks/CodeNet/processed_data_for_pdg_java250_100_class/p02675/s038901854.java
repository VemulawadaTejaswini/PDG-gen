public class Main {
	static long pmod = 1000000007L;
	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		String n = scn.next();
		char ch = n.charAt(n.length() - 1);
		if (ch == '3')
			System.out.println("bon");
		else if (ch == '0' || ch == '1' || ch == '6' || ch == '8')
			System.out.println("pon");
		else
			System.out.println("hon");
	}
}
