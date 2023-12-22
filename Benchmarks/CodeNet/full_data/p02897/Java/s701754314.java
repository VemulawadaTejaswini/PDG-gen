
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),temp=0;
		for(int i=1;i<=n;i+=2)
		{
			temp++;
		}
		System.out.printf("%.10f",(double)temp/n);
	}

}
