import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,k;
		n=sc.nextInt();
		k=sc.nextInt();
		int diff=n%k;
		int res;
		if(diff<=(k/2))
			res=diff;
		else
			res=k-diff;
		System.out.println(res);
	}
}
