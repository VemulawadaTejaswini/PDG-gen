public class Main {
	public static void main(String[] args) throws Exception {
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	int y = scan.nextInt();
	if(x>y) System.out.println("a > b");
	else if(x<y) System.out.println("a < b");
	else System.out.println("a == b");
	}
}
