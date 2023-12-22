import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		//int[] a = new int[n];
		int temp ;
		int over = 0;
		Set<Integer> set = new HashSet<>(); 
		for(int i = 0 ; i< n ; i++)
		{
			temp = Integer.parseInt(s[i]) / 400;
			if(temp >= 8) over++;
			else
			{
				set.add(temp);
			}
		}
		temp = set.size();
		if(temp == 0) {
			temp = 1;
			over-- ;
		}
		System.out.println(temp+" "+(temp + over));
	}
}