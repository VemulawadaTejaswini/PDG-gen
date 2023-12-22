import java.util.Scanner;

public class Main {

	static int gcd(int x,int y)
	{
		return y>0?gcd(y,x%y):x;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int max=0;
		int g=0;
		for (int i = 0; i < n; i++) {
			int x=sc.nextInt();
			g=gcd(g, x);
			max=Math.max(max, x);
		}
		if(k%g==0 &&max>=k)
			System.out.println("POSSIBLE");
		else
			System.out.println("IMPOSSIBLE");
	}

}
