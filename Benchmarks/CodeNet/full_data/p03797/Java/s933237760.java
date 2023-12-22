import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long N = Long.parseLong(str.substring(0, str.indexOf(" ")));
		long M = Long.parseLong(str.substring(str.indexOf(" ") + 1));
		long s = 0;
		while(true)
		{
			if(N >= 1 && M >= 2)
			{
				N--;
				M -= 2;
				s++;
			}
			else if(M >= 4)
			{
				M -= 4;
				s++;
			}
			else
			{
				break;
			}
		}
		System.out.println(s);
	}
}