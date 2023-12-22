import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String s = 		sc.next();
		
		String firstCheck = s.substring(0,(s.length()-1)/2);
		//System.out.println("firstCheck is: "+firstCheck);
		
		String seconCheck = s.substring((s.length()+3)/2 - 1, s.length());
		//System.out.println("seconCheck is: "+seconCheck);
		
		if(checkPalindrome(s) && checkPalindrome(firstCheck) && checkPalindrome(seconCheck))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		
		
		

	}
	
	public static boolean checkPalindrome(String a)
	{
		String b = "";
		
		for(int i=a.length()-1; i>=0; i-- )
		{
			b += a.charAt(i);
		}
		
		//System.out.println("a is: "+a);
		//System.out.println("b is: "+b);
		
		if(a.equals(b))
		{
			return true;
		}
		
		return false;
	}

}
