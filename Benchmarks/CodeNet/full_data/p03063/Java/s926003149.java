import java.io.PrintWriter;
import java.util.Scanner;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("9 ..##..###");
		int n = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		String str = sc.next();
		char c[] = str.toCharArray();
		PrintWriter out = new PrintWriter(System.out);
		int numofb = 0;
		for (int i = 0; i < n; i++)
		{
			if(c[i]=='#')
			{
				numofb++;
			}
		}
		int numofw=n-numofb;
		int ans;
		if(numofw < numofb)
		{
			ans = numofw;
		}
		else
		{
			ans = numofb;
		}
		int lsb =0;
		int rsw =numofw;
		for (int i = 0; i < n-1; i++)
		{
			if(c[i]=='#')
			{
				lsb=lsb+1;
				rsw=rsw+0;
			}
			else
			{
				lsb=lsb+0;
				rsw=rsw-1;
			}
			if(ans > lsb+rsw)
			{
				ans = lsb+rsw;
			}
		}

		out.println(ans);
		//out.println(ans);
		out.flush();
	}
}