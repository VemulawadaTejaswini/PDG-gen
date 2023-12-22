import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.exec();
	}
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int ans = Math.max(0, a - 2*b);
		System.out.println(ans);
	}
}
