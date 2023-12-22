import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		int T=scan.nextInt();
		
		int sum=0;
		double i=(T+0.5)/A;
		
		while(i<(T+0.5)) {
			sum+=B;
		}
		scan.close();
		
		System.out.println(sum);
	}
}