public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int ans = 1;
		for(int i = 0; i < 3; i++) {
			ans = ans * x;
		}
		System.out.println(ans);
	}
}
