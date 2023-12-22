import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		double pBTC = 380000.0;

		int n = scan.nextInt();
		double sum = 0;
		
		for(int i = 0; i < n; i++){
			double x =  scan.nextDouble();
			boolean jpy = scan.next().equals("JPY");
			if(jpy){
				sum += x;
			}else{
				sum += (pBTC * x);
			}
			// System.err.println(sum);
		}
		System.out.println(sum);
		
	}
}
