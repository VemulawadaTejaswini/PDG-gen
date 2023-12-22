import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		long p = 0, g = 0, score = 0;
		char turn;
		for(int i=0;i<s.length();i++)
		{
			if(p < g)
			{
				turn = 'p';
				p++;
			}
			else 
			{
				turn = 'g';
				g++;
			}
			
			if(s.charAt(i) == 'g')
			{
				if(turn == 'p')
					score++;
			}
			else
			{
				if(turn == 'g')
					score--;
			}
		}
		System.out.println(score);
	}
}