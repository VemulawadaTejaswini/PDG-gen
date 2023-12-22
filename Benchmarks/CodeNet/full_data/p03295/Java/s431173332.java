import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main 
{
	static class C implements Comparator<Req>
	{
		@Override
		public int compare(Req o1, Req o2) 
		{
			return o1.r - o2.r;
		}
	}
	
	static class Req
	{
		boolean done = false;
		int l;
		int r;
		
		public Req(int l0, int r0)
		{
			l = l0;
			r = r0;
		}
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();


		ArrayList<Req> list = new ArrayList<Req>();
		
		for(int i = 0; i < m; i++)
		{
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			list.add(new Req(a,b));
		}
		
		C c = new C();
		list.sort(c);
		
		int dn = 0;
		
		int destroyedl = -99;
		for(int i = 0; i < m; i++)
		{
			Req cur = list.get(i);
			
//			System.out.println("Do " + cur.l + " " + cur.r + ", desl " + destroyedl);
			if(cur.l >= destroyedl)
			{
//				System.out.println("Right before " + cur.r);
				destroyedl = cur.r;
				dn++;
			}
			
		}
		
		System.out.println(dn);

	}






}
