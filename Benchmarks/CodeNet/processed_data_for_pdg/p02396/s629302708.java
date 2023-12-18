public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		while(a != 0) {
			a = sc.nextInt();
			if(a == 0) {
				break;
			}
			System.out.println("Case " + b + ": " + a);
			b++;
		}
	}
}
