public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int a = number.nextInt();
		int b = number.nextInt();
		if(a > b) System.out.println("a > b");
		if(a < b) System.out.println("a < b");
		if(a == b) System.out.println("a == b");
	}
}
