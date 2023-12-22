import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sRem = br.readLine().split(" ");
		//int[] chip = new int[n];
		int temp;
		int min = 100, max = 1 ;
		for(int i = 0 ; i< n ; i++)
		{
			temp = Integer.parseInt(sRem[i]) ; 
			if(temp < min) min = temp;
			if(temp > max) max =temp;
		}
		System.out.println(max-min);
	}
}