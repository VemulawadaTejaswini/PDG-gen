import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		int n = sc.nextInt();
		
		int first = (int) Math.pow(100, d);
		
		System.out.println(first * n);
		
	}
}