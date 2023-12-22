import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		String b = stdIn.next();
		
		if (b.equals("A")) {
			System.out.println("T");
			return;
		} if (b.equals("T")) {
			System.out.println("A");
			return;
		} if (b.equals("C")) {
			System.out.println("G");
			return;
		} else {
			System.out.println("C");
		}
		
	}
}