import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {


	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st1.nextToken());
		int m = Integer.parseInt(st1.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<>((x,y)-> x > y ? -1 : x < y ? 1 : 0);
		
		st1 = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < n ; i++)
		{
			long tmp = Long.parseLong(st1.nextToken());
			pq.add(tmp);
		}
		
		
		for(int i = 1 ; i <= m ; i++)
		{
			pq.add(pq.poll()/2);
			//out.println(pq);
		}
		
		long sum = 0l;
		
		while(!pq.isEmpty())
			sum += pq.poll();
		
		out.println(sum);
		out.flush();
		out.close();
	}
	
	
	


}
