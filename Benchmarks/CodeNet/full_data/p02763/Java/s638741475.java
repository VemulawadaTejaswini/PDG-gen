import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String input = scanner.next();
		StringBuilder s = new StringBuilder(input);
		ArrayList<TreeSet<Integer>> app = new ArrayList<TreeSet<Integer>>();
		for(int i = 0 ; i < 26 ; i++)
			app.add(new TreeSet<Integer>());
		for(int i = 0 ; i < s.length(); i++)
			app.get(s.charAt(i) - 'a').add(i);
		int q = scanner.nextInt();
		for(int i = 0 ; i < q ; i++)
		{
			int type;
			type = scanner.nextInt();
			if(type == 1)
			{
				int indx;
				char c;
				indx = scanner.nextInt() - 1;
				c = scanner.next().charAt(0);
				app.get(s.charAt(indx) - 'a').remove(indx);
				s.setCharAt(indx, c);
				app.get(c - 'a').add(indx);
			}
			else
			{
				int l, r, ans = 0;
				l = scanner.nextInt() - 1;
				r = scanner.nextInt() - 1;
				for(int j = 0 ; j < 26 ; j++)
				{
					Integer ret = app.get(j).ceiling(l); 
					if(ret != null && ret <= r)
						ans += 1;
				}
				System.out.println(ans);
			}
		}
		scanner.close();
	}
}