import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String card[] = br.readLine().split(" ");
		int sum = 0;
		sum = (Integer.parseInt(card[1]))*10 + (Integer.parseInt(card[2]));
		if(sum % 4 == 0) System.out.println("YES");
		else System.out.println("NO");
			
	}
}