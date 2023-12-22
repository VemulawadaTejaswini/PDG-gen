import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		byte n = stdIn.nextByte();
		byte k = stdIn.nextByte();
		
		if (n % k == 0) {
			System.out.println(0);
			return;
		}
		if (n % k == 1) {
			System.out.println(1);
			return;
		}
		else {
			System.out.println(1);
			return;
		}
	
	}
		
}