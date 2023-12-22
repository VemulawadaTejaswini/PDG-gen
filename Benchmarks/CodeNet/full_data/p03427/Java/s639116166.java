/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String st = ""+sc.nextLine();
		int a = st.length();
		int b = Integer.parseInt(""+st.charAt(0));
		if(a>1){System.out.printf("%d",b-1+9*(a-1));}
                else{
System.out.print(st);}
	}
}