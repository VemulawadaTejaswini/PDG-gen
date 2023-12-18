public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true) {
			int x = scan.nextInt();
			if (x == 0)
				break;
			count++;
			System.out.println("Case " + count + ": " + x);
		}
	}
}
