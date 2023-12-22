import java.io.*;
import java.util.*;
class Main
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		String s[]=bu.readLine().split(" ");
		int x=Integer.parseInt(s[0]),y=Integer.parseInt(s[1]),a=Integer.parseInt(s[2]),b=Integer.parseInt(s[3]),c=Integer.parseInt(s[4]);
		int r[]=new int[a],g[]=new int[b],cl[]=new int[c],i;
		s=bu.readLine().split(" ");
		for(i=0;i<a;i++)
		r[i]=Integer.parseInt(s[i]);
		s=bu.readLine().split(" ");
		for(i=0;i<b;i++)
		g[i]=Integer.parseInt(s[i]);
		s=bu.readLine().split(" ");
		for(i=0;i<c;i++)
		cl[i]=Integer.parseInt(s[i]);
		
		Arrays.sort(r);Arrays.sort(g); Arrays.sort(cl);
		long ras[]=new long[a],gas[]=new long[b],cas[]=new long[c];
		int t=1,j;
		ras[0]=r[a-1];
		for(i=a-2;i>=0;i--)
		ras[t++]=ras[t-2]+r[i];
		
		t=1;
		gas[0]=g[b-1];
		for(i=b-2;i>=0;i--)
		gas[t++]=gas[t-2]+g[i];
		
		t=1;
		cas[0]=cl[c-1];
		for(i=c-2;i>=0;i--)
		cas[t++]=cas[t-2]+cl[i];
		
		long max=0;
		for(i=1;i<=x;i++)
		for(j=1;j<=y;j++)
		{
			long temp=ras[i-1]+gas[j-1]; int pt=0;
			if(x-i+y-j>0 && x-i+y-j<=c)
			{temp+=cas[x-i+y-j-1]; pt=(x-i)+(y-j);}
			if((pt+i+j)==(x+y) && temp>max) max=temp;
		}
		System.out.print(max);
	}
}