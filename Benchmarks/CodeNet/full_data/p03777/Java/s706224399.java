import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		boolean a = sc.next().toCharArray()[0] == 'H' ? true : false;
		boolean b = sc.next().toCharArray()[0] == 'H' ? true : false;
		
		if (a == b) {
			System.out.println("H");
		} else {
			System.out.println("D");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
