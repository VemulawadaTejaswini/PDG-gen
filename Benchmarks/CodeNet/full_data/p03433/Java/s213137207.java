import java.util.*;
class Main
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = s.nextInt();
		int p = n/500;
		int q = (n - 500*p);
		if(q <=  a  && a!=0) 
		System.out.println("yes");
		else
		System.out.println("no");	

	}
}