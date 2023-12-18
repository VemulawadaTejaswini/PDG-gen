public class Main {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int num = 0;
		while(sc.hasNext()) {
			int a = sc.nextInt();
			if (a == 0) {
				break;
			}
			System.out.println(String.format("Case %d: %d", ++num, a));
		}
	}
}
