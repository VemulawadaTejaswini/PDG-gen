import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String []s=br.readLine().split(" ");
		long H = Long.parseLong(s[0]);
		long sum=0,ans=0,ht;
		
		ht=(long)(log(H)/log(2)); //to the base log 2
		
		ht+=1;//height of the binary tree
		
		//no of nodes of a BT
		
		ans=(long)(pow(2,(ht)));
		ans-=1;
		
		out.println(ans);
	
	}
}


