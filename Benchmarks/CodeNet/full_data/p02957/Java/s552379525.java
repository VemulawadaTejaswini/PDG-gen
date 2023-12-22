import java.util.Scanner;
public class Main {
	
	
	public static int findK(int x)
	{
		int k= x/2;
		System.out.println(k);
		return k;
	}
	
	public static void main(String[] args)
	{
		Scanner scann = new Scanner(System.in); 
		int a=scann.nextInt();
		int b=scann.nextInt();
		
		
		int x= a+b;
		if(a==b)
			System.out.println("IMPOSSIBLE");
		else if(x%2==1)
			System.out.println("IMPOSSIBLE");
		else
			 findK(x);
			;
			
			

}
}
