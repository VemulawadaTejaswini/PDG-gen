import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		String s=in.next();
		char prev=s.charAt(0);
		prev++;
		int ans=0;
		int ne=1;
		for(int i=0;i<s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(ne!=1&&c==prev){			
				i++;
				ne=1;
				ans++;
				prev='1';
			}
			else
			{
				prev=c;
				ne=0;
				ans++;
			}
		}
		if((prev!=s.charAt(s.length()-1))||ne==1)
		{
			ans++;
		}
		System.out.println(ans);
			
	}
}
	