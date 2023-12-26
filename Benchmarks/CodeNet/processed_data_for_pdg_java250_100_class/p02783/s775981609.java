public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int h = parseInt(sc.next());
		int a = parseInt(sc.next());
		sc.close();
		out.println((int)ceil((double)h/a));
	}
}
