import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		int oneLoopTime = (n - m) * 100 + m * 1900;
		
		for(int i = 0; i < m; i++) {
			oneLoopTime *= 2;
		}
		
		System.out.println(oneLoopTime);
	}
	
	

}
