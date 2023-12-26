public class Main {
	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		int n = b.nextInt();
		String s = b.next();
		if(n >= s.length()) {
			System.out.println(s);
		}
		else{
			String f = s.substring(0, n);
			System.out.println(f + "...");
		}
	}
}
