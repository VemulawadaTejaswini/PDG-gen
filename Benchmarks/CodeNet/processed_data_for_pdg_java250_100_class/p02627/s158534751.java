public class Main {
	Main() {
	}
	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		String a = " ";
		boolean hanntei = false;
		a = scanner.next();
		hanntei = a.matches("[a-z]");
		if (hanntei == true) {
			System.out.println("a") ;
		} else {
			System.out.println("A") ;
		}
	}
}
