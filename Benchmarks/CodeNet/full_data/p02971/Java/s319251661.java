							//	package Dynamic;
import java.io.*;
import java.util.*;
class Main
{
    static public void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int t=Integer.parseInt(br.readLine());
//        while(t-->0)
//        {
        	int n=Integer.parseInt(br.readLine());
        	int ar[]=new int[n];
//        	StringTokenizer st=new StringTokenizer(br.readLine());
        	//TreeSet<Integer> tt=new TreeSet<>();
        	int i=0;
        	while(i<n)
        	{
        		ar[i]=Integer.parseInt(br.readLine());
        		i++;
        	}
        	//System.out.println(tt);
        	int max=Integer.MIN_VALUE;
        	int ind=-1;
        	for(int x=0;x<n;x++)
        	{
        		if(ar[x]>max)
        		{
        			max=ar[x];
        			ind =x;
        		}
        	}
        	int max2=Integer.MIN_VALUE;
        	int ff=0;
        	for(int x=0;x<ind;x++)
        	{
        		if(ar[x]>max2)
        		{
        			max2=ar[x];
        			if(max2==max)
        			{
        				ff++;
        			
        				break;
        			}
        		}
        	}
        	if(ff==0)
        	{
	        	for(int x=ind+1;x<n;x++)
	        	{
	        		if(ar[x]>max2)
	        		{
	        			max2=ar[x];
	        			if(max2==max)
	        			{ff++;
	        				break;
	        			}
	        		}
	        	}
        	}
        	if(max==max2)
        	{
        		for(int x=0;x<n;x++)
        			System.out.println(max);
        	}
        	else
        	{
        		for(int x=0;x<n;x++)
        		{
        			if(ar[x]==max)
        				System.out.println(max2);
        			else
        				System.out.println(max);
        		}
        	}
//        	int a=Integer.parseInt(st.nextToken());
//        	int b=Integer.parseInt(st.nextToken());
        	//int c=Integer.parseInt(st.nextToken());
//        	for(int x=0;x<n;x++)
//        	{
//        		ar[x]=Integer.parseInt(st.nextToken());
//        	}
//        	System.out.println((int)Math.ceil(a/((b*2.0)+1)));
        //}
    }
}