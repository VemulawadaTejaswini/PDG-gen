public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int num = 1;
	while(true) {
		int a = scanner.nextInt();
		if( a == 0) {
			break;
		}else {
			System.out.println("Case " + num++ +  ": " + a);
		}
		}
	}
}
