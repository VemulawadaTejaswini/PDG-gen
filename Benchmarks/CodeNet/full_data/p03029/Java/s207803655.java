import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int p=in.nextInt();
		int ans=3*a+p;
		ans=ans/2;
		System.out.println(ans);
	}
}
	