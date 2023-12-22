import java.util.Scanner;

public class Main {
	public static void judge(int x,int y,int z)
	{
		if(Math.sqrt(x)+Math.sqrt(y)<Math.sqrt(z))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a,b,c;
		a=cin.nextInt();
		b=cin.nextInt();
		c=cin.nextInt();
		judge(a,b,c);
		cin.close();
	}

}
