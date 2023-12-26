public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int ab = Integer.parseInt(a + b);
		int sqrt = (int)Math.floor(Math.sqrt(ab));
		System.out.println((sqrt * sqrt == ab)?"Yes":"No");
	}
}
