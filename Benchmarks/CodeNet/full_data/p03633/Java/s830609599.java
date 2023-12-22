import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str);
		long T[] = new long[N];
		long C = 0;
		for(int i = 0; i < N; i++)
		{
			str = br.readLine();
			T[i] = Long.parseLong(str);
			if(C < T[i]) C = T[i];
		}
		long A = 1;
		long TA[] = new long[N];
		boolean b = false;
		boolean b2 = false;
		for(int i = 2; i <= C; i++)
		{
			b = false;
			b2 = false;
			for(int j = 0; j < N; j++)
			{
				TA[j] = T[j] % i;
				//System.out.println(j + " " + TA[j] + " " + T[j]);
				if(TA[j] == 0)
				{
					b = true;
					T[j] = T[j] / i;
					//System.out.println(j + " " + T[j]);
				}
				if(T[j] >= i) b2 = true;
			}

			if(b)
			{
				A *= i;
				i--;
			}
			if(!b2)
			{
				break;
			}
		}
		System.out.println(A);
	}
}
