import java.util.ArrayList;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> D_i = new ArrayList<Integer>();
		for(int i=0;i<N;i++)
		{
		  D_i.add(sc.nextInt());
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
		for(int i=0;i<M;i++)//t
		{
			int tmp=D_i.indexOf(ti[i]);
			if(tmp!=-1)
			{
				D_i.remove(tmp);
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

}

