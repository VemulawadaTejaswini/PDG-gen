import java.util.Scanner;


public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		D_i di[]=new D_i[N];
		for(int i=0;i<N;i++)
		{
			di[i]=new D_i(sc.nextInt());
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
			boolean in_flg=false;
			for(int j=0;j<N;j++)//d
			{
				if(ti[i]==di[j].diff&&!di[j].use)
				{
					di[j].use=true;
					in_flg=true;
					break;
				}
			}
			
			if(!in_flg)
			{
				flg=false;
				break;
			}
		}
		
		String ans = flg? "YES":"NO"; 
		System.out.println(ans);

		
	}

}

class D_i
{
	int diff = 0;
	boolean use = false;
	
	D_i(int diff)
	{
		this.diff=diff;
	}
}