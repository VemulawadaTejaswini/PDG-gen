import java.util.Scanner;

public class Hankei {

	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		int r=scan.nextInt();
		double a,b,c;
		a=r*r*Math.PI;
		b=Math.PI;
		c=a/b;
		System.out.print((int)c);
		scan.close();
	}
}