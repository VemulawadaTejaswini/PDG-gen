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
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int ans;
		if(a==b)
		{
			ans = a*2;
		}
		else
		{
			if(a>b)
			{
				ans = a*2-1;
			}
			else
			{
				ans = b*2-1;
			}
			
		}
		PrintWriter out = new PrintWriter(System.out);

		out.println(ans);
		out.flush();
	}
}