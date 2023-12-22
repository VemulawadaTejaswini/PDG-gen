import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("1000 1000 1000 8 ");
		//int n = Integer.parseInt(sc.next());
		int x, y, z;
		int n = Integer.parseInt(sc.next());
		int na[] = new int[n];
		int ans;
		for(int i = 0; i < n ; i++)
		{
			na[i] = Integer.parseInt(sc.next());
		}
		int max = 0;
		ans = 0;
		for(int i = 0; i < n ; i++)
		{
			if(na[i] >= max) 
			{
				max = na[i];
				ans++;
			}
		}
		PrintWriter out = new PrintWriter(System.out);

		out.println(ans);
		out.flush();
	}
}