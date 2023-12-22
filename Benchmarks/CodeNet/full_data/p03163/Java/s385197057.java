import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			// String h[]=inp.readLine().split(" ");
			String h[]=inp.readLine().split(" ");
			int n=Integer.parseInt(h[0]);
			int w=Integer.parseInt(h[1]);
			Hashtable<Long,Long>hash=new Hashtable<>();
			hash.put((long)0,(long)0);
			for(int i=0;i<n;i++)
			{
					String hh[]=inp.readLine().split(" ");
					long w1=Long.parseLong(hh[0]);
					long v1=Long.parseLong(hh[1]);
					Set<Long>keys=hash.keySet();
					Hashtable<Long,Long>hash1=new Hashtable<>();

					for(Long key:keys){
						long t=key+w1;
						hash1.put(key,Math.max(hash1.getOrDefault(key,(long)0),hash.get(key)));
						if(t<=w)
						{
							if(hash.containsKey(t))
							{
								hash1.put(t,Math.max(hash.get(t),hash.get(key)+v1));
							}
							else
							{
								hash1.put(t,hash.get(key)+v1);	
							}
						}
						
						
						


					}

					hash=hash1;
				
			}
			Set<Long>keys=hash.keySet();
			long max=0;
			for(Long key:keys)
			{
				max=Math.max(hash.get(key),max);
			}
			System.out.println(max);
					
		
	}
	
}
class Pair
{
	int a;
	long b;
	
	Pair(int e, long f)
	{
		a=e;
		b=f;
		
	}
}