public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String s = a +b;
		double i = Integer.parseInt(s);
		double sqr = Math.sqrt(i);
		int c = (int)sqr;
		if(c==sqr) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
