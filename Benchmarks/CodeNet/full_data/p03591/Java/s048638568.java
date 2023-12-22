import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		if(str.substring(0,4).equals("YAKI"))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
