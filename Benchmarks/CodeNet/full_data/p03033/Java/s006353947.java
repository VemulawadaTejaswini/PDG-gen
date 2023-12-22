package GRINDING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
class work{
	int x;
	int s;
	int t;
	work(int a,int b,int c)
	{
		x=c;
		s=a;
		t=b;
	}
}
class compare implements Comparator<work>{

	@Override
	public int compare(work o1, work o2) {
		if(o1.x>o2.x)
		{
			return 1;

		}else if(o1.x<o2.x)
		{
			return -1;
		}else {
			return 0;
		}
	}
	
}



public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int q=scan.nextInt();
		work ar[]=new work[n];
		
		for(int i=0;i<n;i++)
		{
			ar[i]=new work(scan.nextInt(),scan.nextInt(),scan.nextInt());
		}

//		Collections.sort(ar,new compare());
		Arrays.parallelSort(ar,new compare());
		int d[]=new int[q];
		TreeMap<Integer,Integer> people=new TreeMap<Integer,Integer>();
		for(int i=0;i<q;i++)
		{
			d[i]=scan.nextInt();
			people.put(d[i], i);
		}
		int ans[]=new int[q];
		Arrays.fill(ans, -1);
		for(work r:ar)
		{
			int left=r.s-r.x;
			int right=r.t-r.x;
//			int right=r.x-r.s;
//			int left=r.x-r.t;
//			System.out.println(left+" xxx"+right);
			List<Integer> peopletoremove=new ArrayList<>();
			peopletoremove.addAll(people.subMap(left, right).keySet());
			for(int p:peopletoremove)
			{
				//indix
				int index=people.get(p);
				ans[index]=r.x;
				people.remove(p);
				
			}
			
		}
		for(int i=0;i<q;i++)
		{
			System.out.println(ans[i]);
		}
		
	}
}
