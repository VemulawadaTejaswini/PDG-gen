import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		long W = (long)sc.nextInt();
		long H = (long)sc.nextInt();
		long x = (long)sc.nextInt();
		long y = (long)sc.nextInt();
		
		double S = ((double)(W*H))/(double)2;
		
		int a = 0;
		
		if(W%2==0 && W==H) {
			if(W/2==x && H/2==y) {
				a = 1;
			}
		}
		
		System.out.println(S + " " + a);
	}
}

