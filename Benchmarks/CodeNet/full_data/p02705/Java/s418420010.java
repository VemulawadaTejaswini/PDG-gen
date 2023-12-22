import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long r = sc.nextLong();
		double cir = (double)r * 2 * Math.PI;
		
		System.out.printf("%f", cir);
	}

}
