
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//int n=Integer.parseInt(br.readLine());
		//String []s=br.readLine().split(" ");
		
		String S = br.readLine();
		String T = br.readLine();
		
		int c=0;
		
		for(int i=0;i<3;i++)
			if(S.charAt(i) == T.charAt(i))
				c++;
					
		System.out.println(c);	
		
	}
}


