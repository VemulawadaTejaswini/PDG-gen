import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main 
{
	static class C implements Comparator<Entry>
	{

		@Override
		public int compare(Entry o1, Entry o2) 
		{
			long ev = o2.eval() - o1.eval();
			if(ev<0)return-1;
			if(ev>0)return 1;
			return 0;
		}
		
	}
	
	static class Entry
	{
		int x,y,z;
		
		public Entry(int x0, int y0, int z0)
		{
			x=x0;
			y=y0;
			z=z0;
			set.add(key(x,y,z));
		}
		
		long eval()
		{
			return a[x] + b[y] + c[z];
		}
	}
	
	static Long[] a;
	static Long[] b;
	static Long[] c;
	static HashSet<String> set = new HashSet<>();
	
	static String key(int x, int y, int z)
	{
		return x + " " + y + " " + z;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();
		
		a = new Long[x];
		b = new Long[y];
		c = new Long[z];
		
		for(int i = 0; i < x; i++)
			a[i] = sc.nextLong();
		for(int i = 0; i < y; i++)
			b[i] = sc.nextLong();
		for(int i = 0; i < z; i++)
			c[i] = sc.nextLong();
		
		Arrays.sort(a, Collections.reverseOrder());
		Arrays.sort(b, Collections.reverseOrder());
		Arrays.sort(c, Collections.reverseOrder());
		
		C c = new C();
		PriorityQueue<Entry> q = new PriorityQueue<>(c);
		
		q.add(new Entry(0,0,0));
		
		
		StringBuilder sb = new StringBuilder();
		for(int d = 0; d < k; d++)
		{
			Entry pos = q.poll();
			
			sb.append(pos.eval() + "\n");
			
			if(pos.x<x-1 && !set.contains(key(pos.x+1,pos.y,pos.z)) )q.add(new Entry(pos.x+1, pos.y, pos.z));
			if(pos.y<x-1 && !set.contains(key(pos.x,pos.y+1,pos.z)))q.add(new Entry(pos.x, pos.y+1, pos.z));
			if(pos.z<x-1 && !set.contains(key(pos.x,pos.y,pos.z+1)))q.add(new Entry(pos.x, pos.y, pos.z+1));
		}
		System.out.print(sb);
	}

}
