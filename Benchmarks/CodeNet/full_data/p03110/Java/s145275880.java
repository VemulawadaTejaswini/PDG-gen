import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		double ans = 0;
		for (int i=0; i<N; i++){
			double x = sc.nextDouble();
			String S = sc.next();
			
			if (S.equals("JPY")){
				ans+=x;
			}
			else 
				ans+=x*380000;
			
		}
		System.out.println(ans);

	}

}
