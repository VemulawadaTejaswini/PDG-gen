import java.io.*;
import java.util.regex.*;
public class Main
{
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String pattern="A?KIHA?BA?RA?$";
		boolean isMatch=Pattern.matches(str,pattern);
		if(isMatch) System.out.println("YES");
		else System.out.println("NO");
   }
}