import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Double> a=new ArrayList<Double>();
		for(int i=0;i<n;i++)
		{
			a.add(in.nextDouble());
		}
		Collections.sort(a);
		for(int i=0;i<n-1;i++)
		{
			double temp=(a.get(0)+a.get(1))/2.0;
			a.remove(0);
			a.remove(0);
			a.add(temp);
			Collections.sort(a);
		}
		System.out.println(a.get(0));
	}
}
	