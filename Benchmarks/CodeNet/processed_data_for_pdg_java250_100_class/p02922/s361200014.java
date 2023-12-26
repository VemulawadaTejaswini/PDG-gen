public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int socket = 1;
		int tap = 0;
		int capacity = scan.nextInt();
		int border = scan.nextInt();
		while(socket < border) {
			tap++;
			socket += capacity - 1;
		}
		System.out.println(tap);
	}
}
