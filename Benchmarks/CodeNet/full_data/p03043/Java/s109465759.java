
import java.util.Scanner;

public class Main{
	
	

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);

	double N=sc.nextInt();
	double K=sc.nextInt();
	
	double result=0;
	
	for(int i=1;i<=N;i++) {
		int j=0;
		while(true) {
			if(i*Math.pow(2, j)>=K) {
				
				result+=Math.pow(0.5, j)*(1/N);
				break;
			}
			j++;
		}
		
	}
	System.out.println(result);
	

		
	}
	

	
}
		