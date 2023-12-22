import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		new Main().run();
	}
	
	public void run() throws NumberFormatException, IOException
	{
		Scanner file = new Scanner(System.in);
		long N = file.nextLong();
		HashSet<Long> factors = new HashSet<Long>();
		for(long i = 2;i*i<=N;i++)
			if(N%i==0){
				factors.add((long) i);
				factors.add(N/i);
			}
		factors.add(N);
		long sum = 0;
		for(long x:factors)
		{
			long M = x-1;
			if(N/M == N%M)
				sum+=M;
		}
		System.out.println(sum);
	}
}