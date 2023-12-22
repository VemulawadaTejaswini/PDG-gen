import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("11 -1000000000 1000000000 -1000000000 1000000000 -1000000000 0 1000000000 -1000000000 1000000000 -1000000000 1000000000");
		int n = Integer.parseInt(sc.next());
		//int b = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		long a[] = new long[n];
		long min= 10000000000l;
		int numofm = 0;
		long ans = 0;
		for (int i = 0; i < n; i++)
		{
			a[i]= Long.parseLong(sc.next());
			if(a[i]<0)
			{
				if(-a[i]<min)
				{
					min = -a[i];
					numofm++;
				}
				ans = ans-a[i];
			}
			else
			{
				if(a[i]<min)
				{
					min = a[i];
				}
				ans = ans+a[i];
			}
		}
		if(numofm%2==1)
		{
			ans = ans - (2l*min);
		}

		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
}