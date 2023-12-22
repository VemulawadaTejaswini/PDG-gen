import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String s = sc.next();
		boolean[] o = new boolean[n];
		
		for(int i = 0; i < n; i++)
		{
			o[i] = s.charAt(i) == 'o';
		}
		
		int[] fill = new int[n]; //1 sheep 2 wolf
		for(int a = 1; a <= 2; a++)
		{
			fill[0] = a;
			for(int b = 1; b <= 2; b++)
			{
				fill[1] = b;
				//0: a, 1: b
//				System.out.println(a + " " + b);
				
				//assign last fill
				boolean same;
				if(fill[0]==2)same = !o[0];
				else same = o[0];
				if(same)fill[n-1] = b;
				else fill[n-1] = 3-b;
				
				for(int i = 2; i < n; i++)
				{ //fill spot i
					if(fill[i-1]==2)same = !o[i-1];
					else same = o[i-1];
					if(same)fill[i] = fill[i-2];
					
					else fill[i] = 3-fill[i-2];
					
					if(a == 1 && b == 1)
					{
//						System.out.println("Fill " + i + " with: " + fill[i]);
//						System.out.println("Deb " + a + " " + b);
//						System.out.println("Fill " + i + " with: " + (fill[i]==1?'S':'W'));
//						System.out.println("Reason: " + (fill[i-1]==2) + " xor " + o[i-1] + " makes " + same);
					}
				}
				
				//check last claim to 0
				int mustbe;
				if(fill[n-1]==2)same = !o[n-1];
				else same = o[n-1];
				if(same)mustbe = fill[n-2];
				else mustbe = 3-(fill[n-2]);
				
				if(fill[0] != mustbe)
				{
//					System.out.println("LS ERROR: " + fill[n-2] + " and " + fill[0] + ", mustbe " + mustbe);
//					System.out.println("Cause " + fill[n-1] + ", " + o[n-1]);
					continue;
				}
				
				
				//reassign last fill with n-2
				if(fill[n-2]==2)same = !o[n-2];
				else same = o[n-2];
				if(same)mustbe = fill[n-3];
				else mustbe = 3-(fill[n-3]);
				
				if(fill[n-1] != mustbe)
				{
					continue;
				}
				else
				{
					StringBuilder sb = new StringBuilder();
					for(int i = 0; i < n; i++)
					{
						if(fill[i] == 1)sb.append('S');
						else sb.append('W');
					}
					System.out.println(sb);
					return;
				}
				
				
			}
			
			
		}
		System.out.println(-1);

	}

}
