import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		double p = Math.sqrt(m);
		int max = 1;
		
		for(int i = 1 ; i <= p ; i++) {
			if(m % i == 0) {
				int temp = m /i;
				if(temp >= n) {
					int temp1 = 1;
					if(temp % n == 0) {
						 temp1 = temp/n;
					}	
					max = temp1 * i ;
				}
				
			}
		}
		System.out.println(max);
		
	}
	

}
