import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("3 3 ... .#. ...");
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		//int b = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		char a[][] = new char[h][w];
		char anext[][] = new char[h][w];
		int atmp[] = new int[h];
		int max= 0;
		for (int i = 0; i < h; i++)
		{
				a[i]= sc.next().toCharArray();
		}
		for(int k = 0; k < 2000; k++)
		{
		    for (int i=0; i < h; i++) {
		        System.arraycopy(a[i], 0, anext[i], 0, w);
		    }
		    int hap = 0;
			for (int i = 0; i < h; i++)
			{
				for (int j = 0; j < w; j++)
				{
					if(a[i][j] == '.')
					{
						if(i-1>=0)
						{
							if (a[i-1][j] == '#')
							{
								anext[i][j] = '#';
								hap=1;
							}
						}
						if(j-1>=0)
						{
							if (a[i][j-1] == '#')
							{
								anext[i][j] = '#';
								hap=1;
							}
						}
						if(i+1<h)
						{
							if (a[i+1][j] == '#')
							{
								anext[i][j] = '#';
								hap=1;
							}
						}
						if(j+1<w)
						{
							if (a[i][j+1] == '#')
							{
								anext[i][j] = '#';
								hap=1;
							}
						}
					}
				}
			}
			if(hap ==1)
			{
				max++;
			}
		    for (int i=0; i < h; i++) {
		        System.arraycopy(anext[i], 0, a[i], 0, w);
		    }
			
		}

		int ans = max;
		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
    private static int gcd(int m, int n) {
        if(m < n)
        {
        	return gcd(n, m);
        }
        if(n==0)
        {
        	return m;
        }
        return gcd(n, m % n);
    }
}