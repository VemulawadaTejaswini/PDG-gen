import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		char ch[] = String.valueOf(n).toCharArray();
		char x = ch[0];
		char ans[]= {x,x,x};
		int di = Integer.parseInt(String.valueOf(ans));
		if(di>=n)
			System.out.println(di);
		else
		{
			di=di+111;
			System.out.println(di);
		}
		
	}
}
