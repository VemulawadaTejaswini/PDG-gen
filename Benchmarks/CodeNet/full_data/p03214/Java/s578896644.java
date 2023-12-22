import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(s[i]);
		int sum=0,pos=0,f=0;
		for(int i=0;i<n;i++)
			sum+=a[i];
		double avg = ((double)sum)/n;
		for(int i=0;i<n;i++)
		{
			if(a[i]==avg)
			{
				pos=i;
				f=1;
				break;
			}
		}
		if(f==1)
			out.println(pos);
		else
			out.println(0);
		//out.println((int)(Math.ceil((n*2)/k)+Math.ceil((n*5)/k)+Math.ceil((n*8)/k))); 
		out.flush();
		
	}
}

