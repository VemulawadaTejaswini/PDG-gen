import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		char[] sa = S.toCharArray();
		int N = sa.length;
		int cindex = -1;
		boolean result = false;
		for(int i = 0; i < N; i++)
		{
			if(sa[i] == 'C')
			{
				cindex = i;
				break;
			}
		}
		if(cindex != -1)
		{
			for(int i = cindex + 1; i < N; i++)
			{
				if(sa[i] == 'F')
				{
					result = true;
					break;
				}
			}
		}
		if(result) System.out.println("Yes");
		else System.out.println("No");
	}
}