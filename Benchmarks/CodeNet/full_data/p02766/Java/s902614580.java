import java.util.Scanner;

public class Main {
	static int maxn = 100 + 10;
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		int k=cin.nextInt();
		int ans=0;
		while(n!=0)
		{
			n/=k;
			ans++;
		}
		System.out.println(ans);
	}
	
}