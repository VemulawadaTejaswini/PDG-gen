public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String C = sc.next();

		char[] c = C.toCharArray();
        System.out.println((char)(c[0] + 0x01));
		sc.close();
	}
}