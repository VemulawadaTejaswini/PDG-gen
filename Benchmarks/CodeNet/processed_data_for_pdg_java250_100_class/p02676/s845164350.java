public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		String s=scan.next();
		if(s.length()<=n) System.out.println(s);
		else {
			System.out.println(s.substring(0,n)+""+"...");
			}
	}
}
