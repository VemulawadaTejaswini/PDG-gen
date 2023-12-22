
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int n = sc.nextInt();
		
		int res =1;
		for(int i = 0;i<3;i++) {
			res *= n;
		}
		System.out.println(res);
	}
}
