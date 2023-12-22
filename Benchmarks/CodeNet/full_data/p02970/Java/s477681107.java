import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		double D = sc.nextDouble();
		
		// 1人が監視できる期の数
		double one = D*2+1;
		
		System.out.println((int)Math.ceil(N/one));
		
		sc.close();	
	}
}