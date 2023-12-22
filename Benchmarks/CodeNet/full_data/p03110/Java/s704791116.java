
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			String u = sc.next();
			
			if(u.equals("BTC")) {
				x = 380000*x;
			}
			
			sum += x;
		}
		
		System.out.println(sum);
		sc.close();
	}
}
