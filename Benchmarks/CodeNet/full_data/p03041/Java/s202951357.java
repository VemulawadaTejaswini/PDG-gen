import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		String S,str1,str2;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		
		str1 = S.substring(0,2);
		str2 = S.substring(2);
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
				
		if((a>12 && b>12) || (a==0 && b>12) || (a>12 && b==0) || (a==0 && b==0))	System.out.println("NA");
		else if((a<=12 && b>12) || (a<=12 && b==0))	System.out.println("MMYY");
		else if((a>12 && b<=12) || (a==0 && b<=12))	System.out.println("YYMM");
		else	System.out.println("AMBIGUOUS");
	}
}