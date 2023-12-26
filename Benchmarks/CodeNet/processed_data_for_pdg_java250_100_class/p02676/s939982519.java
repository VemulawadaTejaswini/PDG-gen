public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String n = sc.next();
		if(n.length() <= k) System.out.println(n);
		else System.out.println(n.substring(0, k) + "...");
	}
}
