import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n =  Double.parseDouble(sc.next());
		double ans = 0;		
		double a = Math.ceil(n/2);
		ans = (double)a / n ;
		
		System.out.println(ans);
		
	}



}