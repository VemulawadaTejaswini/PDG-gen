import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.exec();
	}
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= 9; i++) {
			
			if(n % i == 0) {
				if((n / i) < 10) {
					System.out.println("Yes");
					return;
				}
			}
		}
		
		System.out.println("No");
			
	}
}