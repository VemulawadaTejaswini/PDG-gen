import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int ans=Math.max((a+b),Math.max(a-b,a*b));

		System.out.println(ans);
			
	}
}
	