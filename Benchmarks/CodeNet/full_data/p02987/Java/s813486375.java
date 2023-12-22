import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
  	public static String fiftyfifty(String S)
    {
  		if(S.charAt(0) == S.charAt(3) && S.charAt(1) == S.charAt(2) && S.charAt(0) != S.charAt(1))
          return "Yes";
      	else if(S.charAt(0) == S.charAt(1) && S.charAt(2) == S.charAt(3) && S.charAt(1) != S.charAt(2))
          return "Yes";
      	else if(S.charAt(0) == S.charAt(2) && S.charAt(1) == S.charAt(3) && S.charAt(1) != S.charAt(2))
          return "Yes";
      	else
          return "No";
          
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String output = fiftyfifty(S);
      	System.out.println(output);
	}
}