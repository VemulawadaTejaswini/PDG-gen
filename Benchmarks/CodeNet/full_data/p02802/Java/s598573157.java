
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
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		int wa=0,ac=0;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); //problem id to 0 for WA and 1 for AC
		
		for(int i=0;i<m;i++)
		{	
			s=br.readLine().split(" ");
			int p_id=Integer.parseInt(s[0]);
			String st=s[1];
			if(map.containsKey(p_id))
			{
				if(st.equals("WA")&& map.get(p_id)!=1)//if s is WA and map.get()==WA
					wa++;
				else if(st.equals("AC")&& map.get(p_id)==0) //if s==AC and map.get()==WA then, AC for the first time
				{
					map.put(p_id,1);
					ac++;
				}
			}
			
			else
			{
				if(st.equals("WA"))
				{
					map.put(p_id,0);
					wa++;
				}
				
				else
				{
					map.put(p_id,1);//AC
					ac++;
				}
			}
		
		}

		
		out.println(ac+" "+wa);
	}
}


