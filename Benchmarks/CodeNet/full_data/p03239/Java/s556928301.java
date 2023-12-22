import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String s = reader.readLine();
		String[] inp = s.split(" ");
		int N,T;
		
		N=Integer.parseInt(inp[0]);
		T=Integer.parseInt(inp[1]);
			
		
		//ArrayList<Integer> arr = new ArrayList<Integer>();
		//HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int t=N;
		
		int[] carr = new int[N];
		int[] t1arr = new int[N];
		int i=0;
		
		while(t-->0)
		{
			String p = reader.readLine();
			String[] par = p.split(" ");
			int c,t1;
			
			c=Integer.parseInt(par[0]);
			t1=Integer.parseInt(par[1]);
			
			carr[i]=c;
			t1arr[i]=t1;
			i++;
						
		}
	
		int max = 0;
		
		for(int i1 = 0; i1 < carr.length; i1++)
        {
            if(max < carr[i1])
            {
                max = carr[i1];
            }
        }
		
		int ans=0;
		int prevcost=max;
		
		
		for (int j = 0; j < t1arr.length; j++) 
		{
			int cost = carr[j];
			int time = t1arr[j];
			
			if(time<=T)
			{
				if(cost<prevcost)
				{
					ans=cost;
					prevcost=cost;
				}
			}
		}		
		
		if(prevcost==max)
			System.out.println("TLE");
		else
			System.out.println(ans);
		

	}

}
