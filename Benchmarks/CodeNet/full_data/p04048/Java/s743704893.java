import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int N = in.nextInt();
			int X = in.nextInt();
			System.out.println(total(N,X));
		}
		in.close();
	}
	public static int total(int N,int X)
	{
		if(N % X == 0)
			return (N/X - 1)*X*3;
		else
		{
			int r = N % X;
			return (N/X - 1)*X*3 + total(X+r,r);
		}
	}
}