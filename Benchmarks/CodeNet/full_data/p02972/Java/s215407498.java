					//			package Dynamic;
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
        	StringTokenizer st=new StringTokenizer(br.readLine());
        	//TreeSet<Integer> tt=new TreeSet<>();
        	int i=0;
        	HashSet<Integer> h=new HashSet<>();
        	while(i<n)
        	{
        		ar[i]=Integer.parseInt(st.nextToken());
        		if(ar[i]==1)
        			h.add(i+1);
        		i++;
        	}
        	if(h.size()>1)
        	{
        		System.out.println("-1");
        		System.exit(0);
        	}
        	if(h.size()==0)
        	{
        		System.out.println("0");
        		System.exit(0);
        	}
        	if(h.size()==1)
        	{
        		if(!h.contains(1))
        			System.out.println("-1");
        		else
        		{
        			System.out.println(1);
        			System.out.println(1);
        		}
        		System.exit(0);
        	}
    }
}