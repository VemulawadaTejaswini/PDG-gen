import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String str = "";
		boolean[] b = new boolean[N];
		boolean bb = true;;
		for(int i = 0; i < N; i++)
		{
			if(s.substring(i, i + 1).equals("o")) str += 0;
			else str += 1;
			b[i] = false;
		}
		int m = Integer.parseInt(str, 2);

		int i = 1;
		int j = 0;
		while(true)
		{
			int U1 = i - 1;
			int U2 = i + 1;
			if(U1 < 0) U1 = N - 1;
			if(U2 >= N) U2 = 0;
			if(s.substring(i, i + 1).equals("o") && i != 0)
			{
				if(!b[i]) b[U2] = b[U1];
				else b[U2] = !b[U1];
				//System.err.println(b[U2]);
			}
			else if(s.substring(i, i + 1).equals("x") && i != 0)
			{
				if(b[i]) b[U2] = b[U1];
				else b[U2] = !b[U1];
				//System.err.println(b[U2]);
			}
			else if(i == 0)
			{
				if(!b[0])
				{
					if(s.substring(i, i + 1).equals("o"))
					{
						if(b[1] == b[N - 1]) break;
						else b[0] = !b[0];
					}
					else
					{
						if(b[1] != b[N - 1]) break;
						else b[0] = !b[0];
					}
				}
				else
				{
					if(s.substring(i, i + 1).equals("x"))
					{
						if(b[1] == b[N - 1]) break;
						else b[0] = !b[0];
					}
					else
					{
						if(b[1] != b[N - 1]) break;
						else b[0] = !b[0];
					}
				}
				j++;
				if(j >= 2)
				{
					bb = false;
					break;
				}
			}
			i++;
			if(i >= N) i -= N;
		}

		if(!bb) System.out.println(-1);
		else
		{
			String M = "";
			for(int i2 = 0; i2 < N ; i2++)
			{
				if(b[i2]) M += "W";
				else M += "S";
				//System.err.println(i2 + "" +  b[i2]);
			}
			System.out.println(M);
		}
	}
}