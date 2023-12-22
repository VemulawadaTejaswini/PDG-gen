import java.io.*;
import java.util.*;
/**
 * @author Rick
 *
 */
class City
{
	int ID;
	int Prefecture;
	int Year;
}

public class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken().trim());
		int M=Integer.parseInt(st.nextToken().trim());
		int[][] PrefectureCities = new int[N][M];
		for(int i=0; i<N; i++)
		{
			Arrays.fill(PrefectureCities[i],Integer.MAX_VALUE);
		}
		City[] cities = new City[M];
		for(int i=0;i<M;i++)
		{
			st = new StringTokenizer(br.readLine());
			int p=Integer.parseInt(st.nextToken().trim());
			int y=Integer.parseInt(st.nextToken().trim());
			cities[i]=new City();
			cities[i].ID=i;
			cities[i].Prefecture=p;
			cities[i].Year=y;
			AddYear2Prefecture(PrefectureCities[p-1],y);
	        }
	
		for(int i=0;i<M;i++)
		{
			int p= cities[i].Prefecture;
			int y= cities[i].Year;
			String pId=String.valueOf(p);
			StringBuilder sb = new StringBuilder();
			for(int z=0;z<6-pId.length();z++)
			{
				sb.append("0");
			}
			sb.append(pId);
			for(int z=0;z<PrefectureCities[p-1].length;z++)
			{
				if(PrefectureCities[p-1][z]==Integer.MAX_VALUE)
					break;
				if(y==PrefectureCities[p-1][z]){
					String yID=String.valueOf(z+1);
					for(int t=0;t<6-yID.length();t++)
					{
						sb.append("0");
					}
					sb.append(yID);
					break;
				}
			}
							
			System.out.println(sb.toString());
		}
	}
	
	private static void AddYear2Prefecture(int[] is, int p){
		  for(int i=0;i<is.length;i++)
		  {
			  if(is[i]==Integer.MAX_VALUE) 
			  { 
				  is[i]=p; 
				  break;
			  }
		  }
		  Arrays.sort(is);
	  }
}