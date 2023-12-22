import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			double n = sc.nextDouble();
			double m = sc.nextDouble();
			
			double ret = ((n-m)*100+m*1900)*Math.pow(2.0, m);
			
			System.out.println((int)ret);
			
	    }
		
	}
	
