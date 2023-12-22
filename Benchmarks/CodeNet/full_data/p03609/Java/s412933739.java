import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), t = sc.nextInt();
		X -= Math.min(X, t);
		System.out.println(X);
	}
}
