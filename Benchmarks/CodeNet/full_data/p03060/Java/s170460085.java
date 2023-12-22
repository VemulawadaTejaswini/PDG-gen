import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("3 10 2 5 6 3 4");
		int n = Integer.parseInt(sc.next());
		//int b = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		int v[] = new int[n];
		int c[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			v[i]= Integer.parseInt(sc.next());
		}
		for (int i = 0; i < n; i++)
		{
			c[i]= Integer.parseInt(sc.next());
		}
		int ans = 0;
		for (int i = 0; i < n; i++)
		{
			if(v[i]>c[i])
			{
				ans += v[i]-c[i];
			}
		}

		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
}