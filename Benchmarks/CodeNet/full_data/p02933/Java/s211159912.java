import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int a = sc.nextInt();
		
		System.out.println(a >= 3200 ? "red": "pink");
	}
}
