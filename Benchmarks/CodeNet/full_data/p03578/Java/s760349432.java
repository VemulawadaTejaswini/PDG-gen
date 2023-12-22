import java.util.HashMap;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<N;i++)
		{
			int tmp=sc.nextInt();
			if(map.containsKey(tmp))
			{
				map.put(tmp, map.get(tmp)+1);
			}
			else
			{
				map.put(tmp, 1);
			}

		}
				
		int M = sc.nextInt();
		int ti[]=new int[M];
		for(int i=0;i<M;i++)
		{
			ti[i]=sc.nextInt();
		}
		sc.close();
		
		/*判定*/
		boolean flg=true;
		for(int i=0;i<M;i++)
		{
			if(map.containsKey(ti[i]))
			{
				if(map.get(ti[i])>0)
				{
					map.put(ti[i], map.get(ti[i])-1);
				}
				else
				{
					flg=false;
					break;
				}
			}
			else
			{
				flg=false;
				break;
			}
		}
		
		String ans = flg? "YES":"NO"; 
		System.out.println(ans);

		
	}
	
	class D_i
	{
		int count =0;
	}


}

