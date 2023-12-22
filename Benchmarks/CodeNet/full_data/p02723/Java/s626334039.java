import java.util.*;
import java.lang.*;
import java.io.*;
class atCoder
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
        char c3=s.charAt(2);
        char c4=s.charAt(3);
        char c5=s.charAt(4);
        char c6=s.charAt(5);
      if(c3==c4 && c5==c6)
        System.out.println("Yes");
      else
         System.out.println("No");
        
	}
}
