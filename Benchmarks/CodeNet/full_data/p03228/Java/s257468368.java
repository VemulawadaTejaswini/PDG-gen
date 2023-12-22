import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args)
    {
	    // Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		// Scanner in = new Scanner(Syste8
    	Scanner in = new Scanner(System.in);
    	Main s = new Main();
    	int a = in.nextInt(), b = in.nextInt(), k = in.nextInt();
    	s.qb(a, b, k);
	}

	void qb(int a, int b, int k)
	{
		int taka = a, aoki = b, p = 0;
		while(k-- > 0)
		{
			if(p == 0)
			{
				if(taka % 2 != 0) taka--;
				aoki += taka / 2;
				taka /= 2;
			}
			else
			{
				if(aoki % 2 != 0) aoki--;
				taka += aoki / 2;
				aoki /= 2;
			}
			p = 1 - p;
		}
		System.out.printf("%d %d\n", taka, aoki);
	}

	void qa(String str)
	{
		String rev = new StringBuilder(str).reverse().toString();
		if(str.length() == 2) System.out.println(str);
		else System.out.println(rev);
	}
}