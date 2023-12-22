import java.util.*;
class main
{
	public  static  void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		if(str.charAt(2)==str.charAt(3) && str.charAt(4)==str.charAt(5))
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
	}
}