import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean yes = true;
		int startx = 0, starty =0;
		for(int i =0; i<n; i++)
		{
			int t = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			
			if(t%Math.abs(x-startx + y-starty) == 0)
			{
				yes = true;
			}
				
			else
			{
					yes = false;
					break;
			}
			if(!yes)
				break;
			startx = x;
			starty = y;
		}
		if(yes)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
