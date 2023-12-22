import java.io.PrintWriter;
import java.util.Scanner;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner("1 1 1");
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		String str = sc.next();
		char c[] = str.toCharArray();
		int max = 0;
		int state = 0;
		int ci = 1;
		int la[] = new int[n+2];
		la[0] = 0; 
		for(int i = 0; i < n ; i++)
		{
			if((int)(c[i]-'0') == state)
			{
				la[ci]++;
			}
			else
			{
				ci++;
				la[ci] = 1;
				if (state == 0)
				{
					state = 1;
				}
				else
				{
					state = 0;
				}
			}
		}
		ci++;
		for(int i = 0; i < ci ; i=i+2)
		{
			int tmp = 0;
			for (int j = i; j < (i + 2*k+1) && j < ci ; j++)
			{
				tmp += la[j];
			}
			if(tmp > max)
			{
				max = tmp;
			}
		}
		int ans = max;

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