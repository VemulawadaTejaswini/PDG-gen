import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int m=s.nextInt();
		
		long ans=(n*(n-1))/2;
		ans=ans+(m*(m-1))/2;
		
		System.out.println(ans);
		
	}
	
}