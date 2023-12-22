import java.io.PrintWriter;
import java.util.Scanner;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("1000");
		//int n = Integer.parseInt(sc.next());
		String str = sc.next();
		char c[] = str.toCharArray();
		int n = c.length;
		int max = 0;
		int tmpmax1 = 0;
		int tmpmax2 = 0;
		for(int i = 0; i < n ; i++)
		{
			if((int)(c[i]-'0') == i%2)
			{
				tmpmax1++;
			}
			else
			{
				tmpmax2++;
			}
		}
		int ans;
		if(tmpmax1>tmpmax2)
		{
			ans = tmpmax2;
		}
		else
		{
			ans = tmpmax1;
		}
		//int x, y, z;
		//int n = Integer.parseInt(sc.next());
		//int na[] = new int[n];
		//int ans;
		//for(int i = 0; i < n ; i++)
		//{
		//	na[i] = Integer.parseInt(sc.next());
		//}


		PrintWriter out = new PrintWriter(System.out);

		out.println(ans);
		out.flush();
	}
}
