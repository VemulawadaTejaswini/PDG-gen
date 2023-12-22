import java.util.Arrays;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long m = sc.nextInt(); //judges
		long v = sc.nextInt(); //problem voted per judge
		int p = sc.nextInt(); //how many problems get chosen
		
		long[] a = new long[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextLong();
		
		Arrays.sort(a);
		
		int l = 0;
		int r = n-1;
		
		int worstgud = 3*n;
//		System.out.println(Arrays.toString(a));
		while(r>=l)
		{
			int consider = (l+r)/2;
			
			//can this problem get chosen?
			long score = a[consider] + m; //this problem will get this much score
			//pth highest score should be <= score^
//			System.out.println(l + " " + r + " " + consider + ": score " + score);
			
			int beaters = 0; //initial beaters
			for(int i = 0; i < n; i ++)
			{
				if(a[i] > score)beaters++;
			}
			//beaters must be less than p
			
			long[] b = a.clone();
			long rem = (m*v)-m;
			for(int i = 0; i < n && rem > 0; i++)
			{ //distribute rest of score
				if(i == consider)continue;
				
				//give b[i] score
				long give = Math.min(score - b[i], m); //up to m that doesn't beat score
				
				give = Math.min(give, rem);
				if(give > 0)
				{
					b[i] += give;
					if(b[i]>score)beaters++;
					rem -= give;
				}
				else 
				{
					break;
				}
			}
			
			//distribute rem into beaters first
			for(int i = n-1; i >= 0 && rem > 0; i--)
			{
				boolean wasbeater = b[i] > score;
				long alreadygiven = b[i] - a[i];
				long givefroma = m;
				long give = givefroma - alreadygiven; //give this many more
				give = Math.min(give, rem);
				
				b[i] += give;
				rem -= give;
				if(!wasbeater && b[i] > score)beaters++; //now beater
			}
			
			if(rem == 0 && beaters < p)
			{
//				System.out.println("GUD ");
				//gud
				worstgud = Math.min(worstgud, consider);
				r = consider-1;
			}
			else
			{
//				System.out.println("NOP");
				//nop
				l = consider+1;
			}
			
		}
		
//		System.out.println("wg " + worstgud);
		System.out.println(n-worstgud);
	}

}
