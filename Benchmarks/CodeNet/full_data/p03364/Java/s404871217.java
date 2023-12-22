import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		char[][] b = new char[n][n];
		
		for(int y = 0; y < n; y++)
		{
			String s = sc.next();
			
			for(int x = 0; x < n; x++)
			{
				b[x][y] = s.charAt(x);
			}
		}
		
		int an = 0;
		for(int i = 0; i < n; i++)
		{ //offsets
			boolean good = true;
			for(int y = 0; y < n && good; y++)
			{
				for(int x = y+1; x < n && good; x++)
				{
					int rx = (x+i)%n;
					int ry = y%n;
					
					int rx2 = (y+i)%n;
					int ry2 = x%n;
					
//					if(i>0)
//					System.out.println(i+": " + rx + " " + ry);
					if(b[rx][ry] != b[rx2][ry2])
					{
						good = false;
						break;
					}
				}
				
			}
			if(good)
			{
				an+=n;
			}
			
		}
		System.out.println(an);
		

	}

}
