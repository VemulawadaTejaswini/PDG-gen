import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		int i = 100;
		long O = 0;
		long T = 0;
		int o = 0;
		int t = 0;
		for(long l = 1; l < Math.sqrt(N); l++)
		{
			if(N % l == 0)
			{
				O = l;
				T = N / l;
				o = (int) Math.log10(O) + 1;
				t = (int) Math.log10(T) + 1;
				if(i > (o > t ? o : t)) i = (o > t ? o : t);
			}
		}
		System.out.println(i);
	}

}
