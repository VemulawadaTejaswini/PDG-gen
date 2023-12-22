import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> b = new ArrayList<>();
		int n=0;
		try
		{
			n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String a[] = str.split("\\s+");
			for(int i=0;i<n;i++)
			{
				b.add(Integer.parseInt(a[i]));
				Collections.reverse(b);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<n;i++)
		{
			if(i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(b.get(i));
		}
	}
}