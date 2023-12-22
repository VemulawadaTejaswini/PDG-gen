import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		double p = Math.sqrt(m);
		int max = 1;
		
		for(int i = 1 ; i <= p ;i++) {
			if(m % i == 0) {
				int temp1 = m/i;
				int temp2 = i;
				int k = 1;
				if(temp1 >= n) {
					if(temp1 % n == 0) {
						k = temp1/n;
					}
					max = Math.max(temp2* k , max);
					k = 1;
				}
				if(temp2 >= n) {
					if(temp2 % n == 0) {
						k = temp2/n;
					}
					max = Math.max(temp1 * k, max);
				}
			}
		}
		System.out.println(max);
		}
	

}