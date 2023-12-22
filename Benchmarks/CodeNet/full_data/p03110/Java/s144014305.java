import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double []x = new double [n];
		double sum = 0;
		for(int i = 0; i < n ; i++) {
			x[i] = sc.nextDouble();
			String u = sc.next();
			
			if(u.equals("JPY")) {
				 sum += x[i];
			}
			if(u.equals("BTC")) {
				sum += (x[i] * 380000);
			}
		}
		System.out.println(sum);

	}

}
