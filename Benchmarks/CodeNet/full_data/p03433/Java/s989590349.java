import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a%=500;
		a-=b;
		String ans = "Yes";
		if(a>0){
			ans = "No";
		}System.out.println(ans);
	}
}